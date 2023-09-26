// import java.time.LocalDateTime;
// import java.util.Scanner;   // импортируем класс Scanner

// public class Seminars {
//     public static void main(String[] args) {
//         while (true) {                      // цикл для постоянного вывода на консоль кода, который написан ниЖе (пока не заполниться память)
//             Scanner scanner = new Scanner(System.in);   // команда для чтения данных с консоли, вводимых пользователем (аналог input)
//             System.out.print("Enter your age: ");
//             int age = scanner.nextInt();    // команда для чтения вводимых пользователем данных
//             if (age >= 18){
//                 System.out.println("Welcome!");
//             }
//             else {
//                 System.out.println("Sorry, you are not allowed!");
//             }
//             System.out.println(LocalDateTime.now());    // функция для определения точной даты и времени
//         }
//     }
// }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * === КОЛЛЕКЦИИ ===
 */
public class Seminars {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>(); // создание коллекции List, содержащей данные разных типов
                                            // в коллекции List данные могут повторяться и выводятся в строгом порядке, как задает пользователь
        list.add("Hello");
        list.add("world");
        list.add(123);
        System.out.println(list);
        
        ArrayList<String> list2 = new ArrayList<>(); // создание коллекции ArrayList с определенным типом данных (String) 
        list2.add("Hello");
        list2.add("world");
        list2.add("Hello");
        // System.out.println(list);   // вывод значения как массив
        System.out.println(list.toString());    // вывод значения как строки

        Set<String> set = new TreeSet<>();  // создание коллекции TreeSet (данные не повторяются и выводятся по-умолчанию самой программой, т.е. в разном порядке)
        set.add("Hello");
        set.add("world!");
        set.add("I");
        set.add("love");
        set.add("it");
        set.add("Hello");
        // System.out.println(list);   // вывод значения как массив
        System.out.println(set.toString());

        Set<String> set2 = new LinkedHashSet<>();  // создание коллекции LinkedHashSet (данные не повторяются, но выводятся в строгом порядке, заданном пользователем)
        set2.add("Hello");
        set2.add("world!");
        set2.add("I");
        set2.add("love");
        set2.add("it");
        set2.add("Hello");
        // System.out.println(list);   // вывод значения как массив
        System.out.println(set2.toString());


        Map<String, Integer> map = new HashMap<>();  // создание коллекции Map (задаются ключи (key) и их значения (value))
        map.put("Ivan", 123456);   // добавление данных через put
        map.put("Dmitry", 555777);
        System.out.println(map.toString());     // выводит все данные: ключ (key) + значения (value) (через '=' и в алфавитном порядке)
        System.out.println(map.get("Dmitry"));  // выводит только (!) значение (value) по определенному ключу


    }
}






