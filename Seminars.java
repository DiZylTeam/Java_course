import java.time.LocalDateTime;
import java.util.Scanner;   // импортируем класс Scanner

public class Seminars {
    public static void main(String[] args) {
        while (true) {                      // цикл для постоянного вывода на консоль кода, который написан ниЖе (пока не заполниться память)
            Scanner scanner = new Scanner(System.in);   // команда для чтения данных с консоли, вводимых пользователем (аналог input)
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();    // команда для чтения вводимых пользователем данных
            if (age >= 18){
                System.out.println("Welcome!");
            }
            else {
                System.out.println("Sorry, you are not allowed!");
            }
            System.out.println(LocalDateTime.now());    // функция для определения точной даты и времени
        }
    }
}
