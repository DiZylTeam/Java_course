
// ===== ТИПЫ ДАННЫХ И ПЕРЕМЕННЫЕ =====

// public class program {
//     public static void main(String[] args) {
//         String s = null;
//         System.out.println(s);

//         short age = 10;
//         System.out.println(age);

//         float x = 123.45f;
//         System.out.println(x);

//         double y = 3.14589479;
//         System.out.println(y);

//         char z = '}';
//         System.out.println(z);

//         char i = 123;   // если присвоить значение несимвольное -> происходит неявное преобразование одного типа данных в другой -> т.е. всё равно выводится символ
//         System.out.println(i);

//         int a = 123;    
//         double d = a;   // неявное преобразование типа данных int в double (т.к. тип double помещает 8 байт, а int - 4 байта). В обратном порядке неявное преобразование нельзя
//         System.out.println(d);

//         boolean f = true && false;
//         System.out.println(f);

//         var j = 123;    // неявная типизация через var -> подставляется тип данных, которому соответсвует значение переменной
//         System.out.println(j);

//         var k = "Hello";
//         System.out.println(k);
//         System.out.println(getType(j)); // вызываем метод (getType) для определения и вывода на консоль типа данных переменной j

//         int o = 123_123;    // большие числа моЖно разделять ниЖним подчеркиванием для наглядности (это не влияет на значение переменной!)
//         System.out.println(Integer.MAX_VALUE);  // Integer - это класс-обёртка -> слуЖат для получения/уточнения/проверки информации о разных типах данных

//         /*
//          * Примитив   Класс-обертка
//             int         Integer
//             short       Short
//             long        Long
//             byte        Byte
//             float       Float
//             double      Double
//             char        Character
//             boolean     Boolean
//          */

//         int q = 123;
//         q++;    // ++ - это инкремент, т.е. добавление единицы (1) к начальному значению
//         System.out.println(q);

//         int p = 123;
//         System.out.println(p++);    // постфиксный инкремент -> не имеет приоритет перед выводом начального значения переменной в консоль
//         System.out.println(p);      // -> т.е. сначала выводится изначальное значение переменной, а потом значение с инкрементом ++

//         int t = 123;
//         System.out.println(++t);    // префиксный инкремент имеет приоритет перед выводом начального значения переменной в консоль
//         System.out.println(t);      // -> т.е. в обоих случаях выводится значение с инкрементом ++

//         int m = 123;
//         m = --m - m--;
//         System.out.println(m);  // будет выводится значение m = 0, т.к. постфиксный инкремент не имеет приоритет перед выводом начального значения переменной в консоль

//         boolean w = 123 <= 321;
//         System.out.println(w);

//     }
//     static String getType(Object l) {   // метод для определения типа данных переменных
//         return l.getClass().getSimpleName();
//     }
// }

// ===== МАССИВЫ ======

// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[10];    // создание нового массива длиной 10 элементов (если не присваиваем значения - по умолчанию все элементы равны 0)
//         System.out.println(arr[3]); // выводим в консоль элемент с индексом 3
//         System.out.println(arr.length);

//         int[] arr_2 = new int[] {1, 5, 10, 100};    // создание нового массива с присваиванием элементам конкретных значений
//         System.out.println(arr_2[3]);
//         System.out.println(arr_2.length);

//         int[] arr_3 = new int[] {1, 5, 10, 100};    
//         arr_3[3] = 13;  // меняем значение элемента с индексом 3
//         System.out.println(arr_3[3]);

//         int[] arr_4;    // моЖно квадратные скобки ставить после типа данных

//         int arr_5[];    // такЖе моЖно квадратные скобки ставить после наименования (идентификатора) массива

//         int[] arr_6[] = new int[3][5];  // создание многомерного массива -> в скобках указываем количество строк и столбцов в массиве
//         int[][] arr_7 = new int[3][5];  // моЖно так создать многомерный массив

//         // == Цикл for ==
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();

//     }

// }

// ====== ПРЕОБРАЗОВАНИЕ ТИПОВ ДАННЫХ =======

// public class program {
//     public static void main(String[] args) {
//         int i = 123; 
//         double d = i;   // преобразование типа данных int в double
//         System.out.println(i); // 123
//         System.out.println(d); // 123.0

//         d = 3.1415; 
//         i = (int)d; // преобразование типа данных double в int (отсекает все числа после запятой) 
//         System.out.println(d); // 3.1415
//         System.out.println(i); // 3

//         byte b = Byte.parseByte("123"); // преобразование строки string в тип данных byte
//         System.out.println(b); // 123

//         b = Byte.parseByte("1234"); // нельзя преобразовать, т.к. тип данных byte моЖет хранить значения от 0 до 255
//         System.out.println(b); // NumberFormatException: Value out of range

//         int[] a = new int[10];
//         double[] d = a; // !!! нельзя полоЖить массив целых чисел в массив типа double !!!
//         // ИЗУЧАЕМ ковариантность и контравариантность

//  }
// }

// ===== Получение данных из терминала =====

// Строки

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }
// Некоторые примитивы

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }

// // Проверка на соответствие получаемого типа

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     } 
// }

// ======= Форматированный вывод =======

// public class program {
//     public static void main(String[] args) {
//         // int a = 1, b = 2;
//         // int c = a + b;
//         // String res = a + " + " + b + " = " + c;
//         // System.out.println(res);

//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

// =======  ФУНКЦИИ И МЕТОДЫ =======

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }

//     static int sum(int a, int b) {
//         return a + b;
//     }

//     static double factor(int n) {
//         if (n == 1)
//             return 1;
//         return n * factor(n - 1);
//     }

//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }
// }

// ===== УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ =====

// Условный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b)
//             c = a;
//         if (b > a)
//             c = b;
//         System.out.println(c);
//     }
// }

// // Тернарный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }

// ====== ОПЕРАТОР ВЫБОРА (switch) ======

//import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         int mounth = 1;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         //iScanner.close();
//     }
// }

// ====== ЦИКЛЫ ======

// Цикл while

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// // Цикл do while

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         do {
//             value /= 10;
//             count++;
//         } 
//         while (value != 0);
//         System.out.println(count);
//     }
// }

// Цикл for

// public class program {
//     public static void main(String[] args) {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// Циклы continue, break

// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break.
// * ближайшего к оператору

// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 10; i++) {
//             if (i % 2 != 0) {
//                 continue;
//             }
//             System.out.println(i);
//         }  
//     }

// }

// // Вложенные циклы

// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//     }
// }

// // Цикл foreach:
// // Работает только для коллекций

// public class Program {
//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }





// ========  API  =========

// === CТРОКИ ===

// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках


// ======== Работа с файловой системой =========

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог


// ======== МАССИВЫ =========

// Как увеличить размер массива?
// Есть массив из 2 элементов

// Например

// public class Ex01_object {
//     public static void main(String[] args) {
//     int[] a = new int[] { 1, 9 };
//     int[] b = new int[3];
//     System.arraycopy(a, 0, b, 0, a.length);
//     for (int i : a) { System.out.printf("%d ", i);} // 1 9
//     for (int j : b) { System.out.printf("%d ", j);}
//     // 0 9 0 0 0 0 0 0 0 0
//     } 
// }


//  public class Ex01_object {  // локальный метод для увеличения (изменения) массива
//     static int[] AddItem(int[] array, int item) {
//     int length = array.length;
//     int[] temp = new int[length + 1];
//     System.arraycopy(array, 0, temp, 0, length);
//     temp[length] = item;
//     return temp;
//  }

//  public static void main(String[] args) {
//     int[] a = new int[] { 0, 9 };
//     for (int i : a) { System.out.printf("%d ", i); }
//     a = AddItem(a, 2);
//     a = AddItem(a, 3);
//     for (int j : a) { System.out.printf("%d ", j); }
//     }
// }



// ========= КОЛЛЕКЦИИ ==========


// === List ===


// Разные способы создания:

// ArrayList list = new ArrayList();

// ArrayList<Integer> list1 = new ArrayList<Integer>(); // указываем точный тип данных (Integer), которые будут храниться в коллекции
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);  // указываем, что в нашей коллекции будет хранилище под 10 элементов
// ArrayList<Integer> list4 = new ArrayList<>(list3);

// List – пронумерованный набор элементов.
// Пользователь этого интерфейса имеет точный контроль над тем,
// где в списке вставляется каждый элемент.
// Пользователь может обращаться к элементам по их целочисленному
// индексу (позиции в списке) и искать элементы в списке.
// ArrayList, LinkedList (Vector, Stack – устаревшие)


// import java.util.ArrayList;
// import java.util.List;
// public class Ex002_ArrayList {
    //  public static void main(String[] args) {
        //  List list = new ArrayList();
        //  list.add(2809);
        //  list.add("string line");

        //  for (Object o : list) {
        //      System.out.println(o);
        //  // Проблема извлечения данных
    //  }
//  }
// }


// === КОЛЛЕКЦИИ. ФУНКЦИОНАЛ ===

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список


// Обычное создание коллекций через примитивные типы данных

// import java.util.Arrays;
// import java.util.List;
// public class Ex004_ArraysMethod {
//     public static void main(String[] args) {
//         int day = 29;
//         int month = 9;
//         int year = 1990;
//         Integer[] date = { day, month, year };
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//     }
// }


// Создание коллекций через StringBuilder (чтобы можно было преобразовывать данные в коллекции)

// import java.util.Arrays;
// import java.util.List;
// public class Ex005_ArraysMethod {
//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         StringBuilder[] date = { day, month, year };    // создание массива из вышеуказанных данных
//         List<StringBuilder> d = Arrays.asList(date);    // преобразование массива в список
//         System.out.println(d); // [29, 9, 1990]
//         date[1] = new StringBuilder("09");  // изменение данных под индексом 1
//         System.out.println(d); // [29, 09, 1990]
//     }
// }



// === LINKEDLIST ===

// Представляет собой двусвязный список.
// Список – гибкая структура данных, позволяющая легко менять свой
// размер. Элементы доступны для вставки или удаления в любой позиции.

// LinkedList нужен для небольшого количества
// элементов, в которых операции добавления\удаления
// встречаются чаще операций чтения.



// === QUEUE ===

// Queue<Integer> queue = new LinkedList<Integer>();    // создание коллекции queue
// queue.add(4);                                        // добавление элемента 
// int item = queue.remove();                           // удаление элемента (удаляет по очереди добавления элементов в коллекцию ->
                                                        // -> т.е. сначала удалит элемент, добавленный первым и т.д.)


// import java.util.*;
// public class Ex002_Queue {
//      public static void main(String[] args) {
        //  Queue<Integer> queue = new LinkedList<Integer>();
        //  queue.add(1);
        //  queue.add(2);
        //  queue.add(3);
        //  queue.add(4);
        //  System.out.println(queue); // [1, 2, 3, 4]
        //  int item = queue.remove();
        //  System.out.println(queue); // [2, 3, 4]
        //  queue.offer(2809);
        //  item = queue.remove();
        //  System.out.println(queue); // [3, 4, 2809]
        //  item = queue.remove();
        //  System.out.println(queue); // [4, 2809]
        //  item = queue.poll();
        //  System.out.println(queue); // [2809]
        //  }
// }


// Подвид PriorityQueue - Наивысший приоритет имеет «наименьший» элемент.

// Подвид DeQueue - Линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.

// == Команды для DeQueue ===

// import java.util.*;
// public class Ex003_Deque {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1); deque.addLast(2);
//         deque.removeFirst(); deque.removeLast();
//         deque.offerFirst(1); deque.offerLast(2);
//         deque.pollFirst(); deque.pollLast();
//         deque.getFirst(); deque.getLast();
//         deque.peekFirst(); deque.peekLast();

// === Stack ===

// Stack (подвид List) представляет собой обработку данных по принципу LIFO (Last in, First out).
// Расширяет Vector пятью операциями, которые позволяют рассматривать вектор как стек.

// push(E item) // добавление элемента в стэк (можно и add)
// peek - добавление верхнего элемента
// pop()    // удаление верхнего элемента




// === ИТЕРАТОР ===


// Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
// Enumeration в Java Collections Framework. 
// Итераторы отличаются от перечислений двумя способами:
// Итераторы позволяют вызывающей стороне удалять элементы из
// базовой коллекции во время итерации с четко определенной
// семантикой.

// hasNext(), next(), remove()

// ListIterator<E>
// hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)



// import java.util.*;
// public class Ex007_Iterator {
//     public static void main(String[] args) {
//         List<Integer> list = List.of(1, 12, 123, 1234, 12345);

//         for (int item : list) { System.out.println(item); }
//         Iterator<Integer> col = list.iterator();

//         while (col.hasNext()) {
//         System.out.println(col.next());
//         }
//     }
// }


// import java.util.*;
// public class Ex007_Iterator {
//     public static void main(String[] args) {
//         List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        
//         for (int item : list) { System.out.println(item); }
//         Iterator<Integer> col = list.iterator();
        
//         while (col.hasNext()) {
//         //System.out.println(col.next());
//         col.next();
//         col.remove();
//         }
//     }
// }




// === MAP ===

// Map – это множество коллекций, работающих с данными
// по принципу <Ключ / Значение>.
// Ключевые особенности:
// ● ускоренная обработка данных;
// ● порядок добавления не запоминается.
// В HashMap элементы располагаются как угодно и могут
// менять свое положение.


// import java.util.*;
// public class Ex001_HashMap {
//     public static void main(String[] args) {
//         Map<Integer, String> db = new HashMap<>();
//         db.put(1, "один"); System.out.println(db);
//         db.put(2, "два"); System.out.println(db);
//         db.put(3, "три"); System.out.println(db);
//         db.put(31, "три один"); System.out.println(db);
//         db.put(13, "один три"); System.out.println(db);
//         db.put(null, "!null"); System.out.println(db);
//         db.put(null, null); System.out.println(db);


// = ФУНКЦИОНАЛ MAP =

// put(K,V) – добавить пару если или изменить значение,если ключ имеется.
// putIfAbsent(K,V) – произвести добавление если ключ не найден.
// get(K) - получение значения по указанному ключу.
// remove(K) – удаляет пару по указанному ключу.
// containsValue(V) – проверка наличия значения.
// containsKey(V) – проверка наличия ключа.
// keySet() – возвращает множество ключей.
// values() – возвращает набор значений.



// = Работа с парами =
// import java.util.*;
// public class Ex002_HashMapEntry {
//     public static void main(String[] args) {
//         Map<Integer, String> db = new HashMap<>();
//         db.putIfAbsent(1, "один");
//         db.put(2, "два");
//         db.put(3, "три");
//         System.out.println(db);

//         for (var item : db.entrySet()) { // цикл с функцмей .entrySet для прохода по коллекции
//         System.out.printf("[%d: %s]\n", item.getKey(), item.getValue()); // получение ключа и значения
//         }
//     }
// }


// = Как ускорить работу =

// import java.util.*;
// public class Ex003_HashMapBoost {
//     public static void main(String[] args) {
//         Map<Integer,String> map1 = new HashMap<>();  // выделение места в памяти по умолчанию
//         Map<Integer,String> map2 = new HashMap<>(9); // можно указать конкретное количество элементов, которые будут содержаться в нашем массиве
//         Map<Integer,String> map3 = new HashMap<>(9, 1.0f);   // количество элементов + указание на сколько процентов надо увеличить массив при 100% заполнении



// == TREE MAP ==

// import java.util.*;
// public class Ex004_TreeMap {
//      public static void main(String[] args) {
//         TreeMap<Integer,String> tMap = new TreeMap<>();
//         tMap.put(1,"один"); System.out.println(tMap);
//         // {1=один}
//         tMap.put(6,"шесть"); System.out.println(tMap);
//         // {1=один, 6=шесть}
//         tMap.put(4,"четыре"); System.out.println(tMap);
//         // {1=один, 4=четыре, 6=шесть}
//         tMap.put(3,"три"); System.out.println(tMap);
//         // {1=один, 3=три, 4=четыре, 6=шесть}
//         tMap.put(2,"два"); System.out.println(tMap);
//         // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}


// = Методы Tree Map =

// put(K,V) 
// get(K) 
// remove(K)
// descendingMap() 
// tailMap() 
// headMap() 
// lastEntry() 
// firstEntry()


// === LinkedHashMap ===

// “Старший брат” коллекции HashMap, который всё помнит…
// Помнит порядок добавления элементов ➜ более медлительный

// Map<Integer,String> linkmap = new LinkedHashMap<>();

// import java.util.*;
// public class Ex005_LinkedHashMap {
//     public static void main(String[] args) {
//         Map<Integer,String> linkmap = new LinkedHashMap<>();
//         linkmap.put(11, "один один");
//         linkmap.put(1, "два");
//         linkmap.put(2, "один");
//         System.out.println(linkmap); // {11=один один, 1=два, 2=один}
//         Map<Integer,String> map = new HashMap<>();
//         map.put(11, "один один");
//         map.put(2, "два");
//         map.put(1, "один");
//         System.out.println(map); // {1=один, 2=два, 11=один один}



// === HashTable ===

// «Устаревший брат» коллекции HashMap,
// который не знает про null

// import java.util.*;
// public class Ex006_HashTable {
//     public static void main(String[] args) {
//         Map<Integer,String> table = new Hashtable<>();
//         table.put(1, "два");
//         table.put(11, "один один");
//         table.put(2, "один");
//         System.out.println(table); // {2=один, 1=два, 11=один один}
//         // table.put(null, "один"); // java.lang.NullPointerException
//         }
// }





