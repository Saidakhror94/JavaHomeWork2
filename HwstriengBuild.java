package Lesson10;

public class HwstriengBuild {
    public static void main(String[] args) {
                                 reverseConcatenate("Hello", "World");

    }
    public static void reverseConcatenate(String str1, String str2) {
        String concatenatedString = str1 + str2;
        String reversedString = new StringBuilder(concatenatedString).reverse().toString();
        System.out.println(reversedString);         // Конец первого задания


        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        String strs = new String(arr);
        strs = strs.replace("?", "e");
        System.out.println(strs);                     // первый вариант решения второго задания


        char[] arrs = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        StringBuilder sb = new StringBuilder();
        for (char c : arrs) {
            sb.append(c);

            int index = sb.indexOf("?");
            if (index != -1) {
                sb.replace(index, index + 1, "e");              // второй вариант решения втрого задания
            }
        }

    }


        }

