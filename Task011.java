// 1. Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка
// 2. Написать метод, который принимает массив элементов, помещает их в очередь
// и выводит на консоль содержимое очереди

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Task011 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        Stack<Integer> stack = new Stack<>();           // создание коллекции Stack
        for (int i = 0; i < array.length; i++) {
            stack.add(array[i]);
        }
        System.out.println(stack.toString());
    

    
        int[] arr = new int[] {1, 3, 5, 7};
        Queue<Integer> queue = new LinkedList<>();      //// создание коллекции Queue
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        System.out.println(queue.toString());


        int[] arr2 = new int[] {2, 3, 5, 7, 10};
        Stack<Integer> stack2 = new Stack<>();
        for (int i = 0; i < arr2.length; i++) {
            stack2.push(arr2[i]);
        }
        System.out.println(stack2);
        for (int i = 0; i < stack2.size(); i++) {
            if (stack2.empty()) {
                return;
            }
            else {
                stack2.pop();
            }
        }
        System.out.println(stack2);
        System.out.println(stack2.peek());
        




        //size(), empty(), push(), peek(), pop().


    }
}


