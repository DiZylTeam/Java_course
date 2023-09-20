// Дан массив двоичных чисел [1, 1, 0, 1, 1, 1, 1]
// Вывести максимальное количество подряд идущих 1



public class Task002 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        int count = 0;
        int maxCount = count;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count ++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println((maxCount));
    }
}
