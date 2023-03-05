package HomeWork;

import java.util.Arrays;

public class HmW {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 5}; // массив, содержащий все числа от 1 до a, за исключением одного пропущенного
            int a = 5; // количество чисел в диапазоне от 1 до a

            // вычисляем сумму всех чисел от 1 до a
            int sum = (a * (a + 1)) / 2;

            // вычисляем сумму всех чисел в массиве
            int sumArray = Arrays.stream(array).sum();

            // вычисляем пропущенное число как разницу между суммой всех чисел от 1 до a и суммой всех чисел в массиве
            int missingNumber = sum - sumArray;

            System.out.println("Пропущенное число: " + missingNumber);
        }
    }


