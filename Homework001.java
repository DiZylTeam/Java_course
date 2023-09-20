// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// n = 4 -> 10
// n = 5 -> 15

import java.util.Scanner;

public class Homework001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int countNTriangle = 0;
        for (int i = 1; i <= num; i++) {
            countNTriangle = countNTriangle + i;
        }
        System.out.println(countNTriangle);
    }
}
