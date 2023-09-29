// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.Map;

public class task014 {
    public static void main(String[] args) {
        Map<Integer, String> bd = new HashMap<>();
        bd.put(123456, "Иванов");
        bd.put(321456, "Васильев");
        bd.put(234561, "Петрова");
        bd.put(234432, "Иванов");
        bd.put(654321, "Петрова");
        bd.put(345678, "Иванов");
        System.out.println(bd);
        for (var item: bd.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item);
            }
        }  
    }
}
