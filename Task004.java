// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.




import java.util.Scanner;

public class Task004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        String a = "c1";
        String b = "c2";
        StringBuilder stringBuilder = new StringBuilder("");    // создаем класс StringBuilder для работы с API и преобразования строк
        for (int i = 0; i < num / 2; i++) { // 'num/2' - если нужна длина строки, равная num, если просто 'num' - длина будет в два раза больше
            stringBuilder.append(a).append(b);  // заполняем строку значениями c1 и c2
        }
        System.out.print(stringBuilder);
    }   
}
