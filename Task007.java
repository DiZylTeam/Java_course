// Заполнить список десятью случайными числами
// Отсортировать список методом sort() и вывести его на экран

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Task007 {
    public static void main(String[] args) {

        System.out.println(randomNumbers(10).toString());
    }

        public static ArrayList<Integer> randomNumbers(int num){
            Random random = new Random();   // вызов класса Random для набора случайных чисел
            ArrayList<Integer> list = new ArrayList<>();    // создание нового списка типа <Integer>
            for (int i = 0; i < num; i++) {     // запускаем цикл для заполнения списка случайными числами
                list.add(random.nextInt(1, 20));    // добавляем в список рандомные числа через метод random.nextInt() 
                                                                // -> в скобках можно задать нижний и верхний порог рандомных чисел
            }
        Collections.sort(list);     // сортировка списка через класс Collections метод sort
        return list;
        }
}

