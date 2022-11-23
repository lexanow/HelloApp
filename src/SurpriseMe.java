/*
Выводить на экран "Не угадал!" до тех пор, пока с клавиатуры не будет введено число 1.

Запрашивать число с клавиатуры:
Вариант 1: перед выводом на экран "Не угадал!"
Вариант 2: после вывода на экран "Не угадал!"

Подумать, где стоило бы использовать цикл do-while, а где – нет.
 */

import java.util.Scanner;
public class SurpriseMe {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        while (in.nextInt() != 1) {
            System.out.println("Не угадал!");
        }

        in.close();
    }
}
