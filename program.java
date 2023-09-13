
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
