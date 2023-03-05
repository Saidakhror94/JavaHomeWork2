package HomeWork05032023;

public class HmW050323 {
    public static void main(String[] args) {
        for (int i = 1; i<=20; i++){
        System.out.println("Это строка Номер" +i);}

        for (int j = 40; j>=20; j--){
            System.out.println("В порядке убывания " +j);
        }

        int sum = 0;
        for (int i = 20; i <= 60; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел от 20 до 60: " + sum);





    }
}
