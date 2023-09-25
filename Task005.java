// Напишите метод, который сжимает строку. 
// Пример: 
// вход aaaabbbcdd
// выход: abcd





public class Task005 {
    public static void main(String[] args) {
        String a = "aaaaabbbcdd";
        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = a.charAt(0); // создаем переменную со значением первого символа (под индексом 0)
        for (int i = 1; i < a.length(); i++) {  // i = 1, т.к. начинаем сравнивать его и currentChar (с индексом 0)
            char nextChar = a.charAt(i);    // создаем переменную, которой присваиваем все последующие значения при прохождении массива
            if (nextChar != currentChar) {  // если последующий символ не равен текущему ->
                stringBuilder.append(currentChar);  // текущий символ заносим в stringBuilder
                currentChar = nextChar; // значению текущего символа присваиваем значение последующего символа (для дальнейшего сравнения)
            }
        }
        stringBuilder.append(currentChar);  // заносим в stringBuilder последний символ (currentChar), т.к. его не с чем сравнивать в конце
        System.out.println(stringBuilder);  // выводим на консоль
    }
}
