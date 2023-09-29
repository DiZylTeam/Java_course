// Пусть дан LinkedList с несколькими элементами.
// Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.

// Пример

// Данo: 
// [1, One, 2, Two]

// Вывод:
// [1, One, 2, Two]
// [Two, 2, One, 1]

import java.util.LinkedList;

public class Homework007 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add("One");
        list.add(2);
        list.add("Two");
        System.out.println(list);

        LinkedList<Object> reversedList = revert(list);
        System.out.println(reversedList);

    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {    // метод для перевертывания списка
        LinkedList<Object> newList = new LinkedList<>();            // создаем новый пустой список
        for (int i = ll.size()-1; i >= 0; i--) {        // проходим по входному списку с последнего элемента (i = ll.size()-1) до нулевого (i >= 0)
            newList.add(ll.get(i));                 // заносим значения эелементов в новый список
        }
        return newList;
    }
}


// ===== ВТОРОЙ СПОСОБ =====

// public static LinkedList<Object> revert(LinkedList<Object> ll) {
//     LinkedList<Object> reversed = new LinkedList<>();
//     for (Object o : ll) {
//         reversed.addFirst(o);
//     }
//     return reversed;
// }


