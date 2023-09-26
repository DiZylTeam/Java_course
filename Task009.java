// Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;

public class Task009 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Привет");
        list.add("я люблю");
        list.add(55);
        list.add("вареную");
        list.add(123);
        list.add("кукурузу");
        list.add(7);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {   // задаем условие с помощью метода 'instanceof': если значение i является экземпляром типа Integer 
                list.remove(i); // -> удаляем элемент (функция remove)
            }
        }
        System.out.println(list);

    }
}
