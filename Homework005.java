// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, 
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:
// Integer[] arr - список целых чисел

// Пример
// arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
// removeEvenNumbers(arr); // [1, 3, 5, 7, 9]

// arr = new Integer[]{2, 4, 6, 8};
// removeEvenNumbers(arr); // []

import java.util.ArrayList;
import java.util.Arrays;

public class Homework005 {
    public static void main(String[] args) {
            Integer[] arr = new Integer[]{2, 4, 6, 8};
            ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));   // преобразуем массив в список
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {     // задаем условие: если число делится без остатка на 2 (т.е. четное) ->
                    list.remove(i);             // -> удаляем это число
                    i--;                        // присваиваем i предыдущий индекс, т.к. после remove все числа смещаются по индексу влево ->
                }                               // -> и нам снова надо проверить тот же индекс после i++
            }
            System.out.println(list);
    }
}
