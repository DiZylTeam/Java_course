// Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
// Integer[] arr - список целых чисел

// Пример
// arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
// analyzeNumbers(arr)
// Вывод:
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework006 {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 2, 7, 5, 1, 3, 8, 6, 9};
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println("Average is " + sum / list.size());
    }
}


// ==== Второе решение ====

// public static void analyzeNumbers(Integer[] arr) {
//         ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
//         list.sort(Integer::compareTo); // сортировка списка по возрастанию
//         System.out.println(list); // вывод списка на экран
//         System.out.println("Minimum is " + list.get(0)); // нахождение минимального значения в списке и вывод на экран
//         System.out.println("Maximum is " + list.get(list.size()-1)); // нахождение максимального значения в списке и вывод на экран

//         int sum = 0;
//         for(int i : list){ // вычисление суммы всех элементов списка
//             sum += i;
//         }
//         System.out.println("Average is = " + sum / list.size()); // вычисление среднего арифметического значений списка и вывод на экран
// }