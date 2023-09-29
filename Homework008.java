// В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Homework008 {
    public static void main(String[] args) {
        
        
        Queue<Object> i = new LinkedList<>();
        i.enqueue(1);
        i.enqueue(10);
        i.enqueue(5);
        System.out.println(i);

    }
    public static Queue<Object> enqueue(int element) {
           
        Queue<Object> queue = new LinkedList<>();
        queue.add(element);
        return queue;

    }

    public static Queue<Object> GetsElements(Queue<Object> a) {
        Queue<Object> myQueue = new LinkedList<>();
        myQueue.add(a);
        return myQueue;
    }
}
