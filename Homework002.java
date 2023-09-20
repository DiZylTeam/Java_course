// Напишите функцию, которая выведет на экран все простые числа 
// в промежутке от 1 до 1000, каждое на новой строке.




public class Homework002 {
    public static void main(String[] args) {
        for (int i = 3; i <= 7; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
