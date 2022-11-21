/*
Задача 2:
Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.
 */

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a = Math.abs(in.nextInt());
        in.close();

        //Узнаем длину числа путём преобразования int в string
        String s = String.valueOf(a);
        int len = s.length();
        // System.out.println("Длина числа " + s + " равна " + len);

        // Переменная s имеет значение равное a только ввиде строки текста.
        // В цикле будем получать значения из s, преобразовывать в int и суммировать
        char chA;
        int digA;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            chA = s.charAt(i);
            digA = Character.digit(chA, 10);
            sum += digA;
        }

        System.out.println("Сумма цифр введённого числа равна " + sum);
    }
}
