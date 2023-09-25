// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) 
// над двумя числами и возвращать результат. В классе должен быть метод calculate, 
// который принимает оператор и значения аргументов и возвращает результат вычислений.

// При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".



import java.util.Scanner;

public class Homework003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter a number_1: ");
        int num_1 = scan.nextInt();
        System.out.print("Enter a number_2: ");
        int num_2 = scan.nextInt();
        System.out.print("Operation (+, -, *, /): ");
        char oper = scan.next().charAt(0);
        int c = calculate(oper, num_1, num_2);
        System.out.println(c);
    }

    public static int calculate(char op, int a, int b) {
        int result = 0;
        if (op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else if (op == '/') {
            result = a / b;
        }
        else {
            System.out.println("Invalid operator");
        }
        return result;
    }    
}

