// 1. Напишите метод, который заполнит массив из 1000
// элементов случайными цифрами от 0 до 24.
// 🐀 2. Создайте метод, в который передайте заполненный выше
// массив и с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с
// плавающей запятой.
// 🐀 Для вычисления процента используйте формулу:
// 🐀 процент уникальных чисел = количество уникальных чисел *
// 100 / общее количество чисел в массиве.

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task016 {
    public static void main(String[] args) {
        int[] arr = RandomNums(1000);
        System.out.println(Arrays.toString(arr));
        float per = UniqSetFloat(arr);
        System.out.println(per);
        

    }

    public static int[] RandomNums(int num) {
        Random random = new Random();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = random.nextInt(0, 25);
        }
        return array;
    }

    public static float UniqSetFloat(int[] array) {

        Set<Integer> hashSet = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
        float percent = hashSet.size() * 100 / array.length;
        return percent;
    }
}

