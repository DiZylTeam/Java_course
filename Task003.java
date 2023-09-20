// Дан массив nums = [3, 2, 2, 3] и число val = 3
// Если в массиве есть числа, равные заданному, ну;но перенести эти элементы в конец массива
// Таким образом, первые несколько (или все) элементов массива долЖны быть отличны от заданного,
// а остальные равны ему

import java.util.Arrays;

public class Task003 {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 2, 3, 5, 8, 6, 3, 9};
        int val = 3;
        for (int count = 0; count < nums.length - 1; count++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {  
                    int temp = nums[i + 1];             
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}


