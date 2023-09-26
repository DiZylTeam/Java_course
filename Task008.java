// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// Убрать повторяющиеся планеты из списка и вывести названия планет, которые встречаются

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Task008 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();    // создаем список из планет
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");

        int n = 10;
        var random = new Random();
        ArrayList<String> list = new ArrayList<String>();   // создаем новый список из планет с рандомным заполнением списка планетами
        for (int i=0; i < n; i++) {
            var planet = planets.get(random.nextInt(0, planets.size()));
            list.add(planet);
        }
        System.out.println(list);

        Map<String, Integer> planetTimes = new HashMap<>(); // создаем коллекцию Map из планет для присвоения им ключей и значений

        for (var planet : list) {
            if (!planetTimes.containsKey(planet)) {
            planetTimes.put(planet, 1);
            }
            else {
            var temp = planetTimes.get(planet);
            planetTimes.put(planet, temp + 1);
            }
        }
        System.out.println(planetTimes);

        Set<String> filteredList = new LinkedHashSet<>(list);   // переводим в set для отфильтровки повторяющихся планет
        System.out.println(filteredList);
    }
}
