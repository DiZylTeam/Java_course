// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
// Отмена последней операции должна быть реализована следующим образом: 
// если передан оператор '<' калькулятор должен вывести результат предпоследней операции.





import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework009 {
    public static void main(String[] args) {
         while (true) {
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter a number_1: ");
        int num_1 = scan.nextInt();
        System.out.print("Operation (+, -, *, /): ");
        char oper = scan.next().charAt(0);
        System.out.print("Enter a number_2: ");
        int num_2 = scan.nextInt();
        
        // System.out.print("Enter a number_3: ");
        // int num_3 = scan.nextInt();
        // System.out.print("Enter a number_4: ");
        // int num_4 = scan.nextInt();
        // System.out.print("Operation (+, -, *, /): ");
        // char oper2 = scan.next().charAt(0);
        // int c = calculate(oper, num_1, num_2);
         
        Deque<Integer> i = new ArrayDeque<>();
        i.add(calculate(oper, num_1, num_2));
        // i.addAll(i);
        
        // i.add(calculate(oper2, num_3, num_4));
        
        for (int j = 0; j < i.size(); j++) {
            Deque<Integer> k = new ArrayDeque<>();
            k.addAll(i);
        
        if (oper == '<') {
            k.removeLast();
            System.out.println(k.getLast());
            break;
        }
        System.out.println(k);
    }
        System.out.println(i);

        
    }
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
        // else if (op == '<') {
        //     result = ;
        // }
        // else {
        //     System.out.println("Invalid operator");
        // }
        return result;
    }    
}