// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена 
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Homework010 {
    public static void main(String[] args) {
            HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
            addNumber("Иванов", 56849, phoneBook);
            addNumber("Васильев", 468156, phoneBook);
            addNumber("Петрова", 123456, phoneBook);
            addNumber("Иванов", 987654, phoneBook);
            addNumber("Петрова", 555777, phoneBook);
            addNumber("Иванов", 787897, phoneBook);
            printPhoneBook(phoneBook);
        }


        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } 
            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
    
        }

        public static void printPhoneBook(Map<String, ArrayList<Integer>> map){
            for (var item : map.entrySet()) {
                String phones = "";
                for(int i: item.getValue()){
                    phones = phones + i + ", ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
  

  
    

    



