// Внутри класса MergeSort напишите метод mergeSort, 
// который принимает массив целых чисел a и реализует алгоритм сортировки слиянием. 
// Метод должен возвращать отсортированный массив.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Homework004
 */
public class Homework004 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2 ,5, 8};
        int[] res = mergeSort(arr);     // исполняем метод mergeSort
        System.out.println(Arrays.toString(res));   // вывод на консоль массива
    }

    public static int[] mergeSort(int[] a) {    // создаем метод mergeSort
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);

        // преобразование списка в примитивный тип int:
        int[] myArray = new int[list.size()];   // создаем новый пустой массив с указанием его длины, равной длине списка (list.size())
        for (int i = 0; i < list.size(); i++) { // запускаем цикл for для прохода по списку
            myArray[i] = list.get(i);           // присваиваем элементам нового массива значения элементов списка
        }
        return myArray;
    }
}