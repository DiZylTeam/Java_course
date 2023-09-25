// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение)



public class Task006 {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        boolean result = isPalindrome(input);
        System.out.println("Is palindrome: " + result); // Вывод: "Is palindrome: true"
    }


    public static boolean isPalindrome(String input) {
    return input.replaceAll("\\s", "").equalsIgnoreCase(new StringBuilder(input).reverse().toString().replaceAll("\\s", ""));
    }
}

