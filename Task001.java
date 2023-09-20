// Программа для ввода пользователем своего имени и вывода фразы
// "Привет, <имя>!"




import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
    }
}
