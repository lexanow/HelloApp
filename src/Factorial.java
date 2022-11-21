/*
Ввести с клавиатуры целое число. Вывести в консоль его факториал.
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Просим ввести число
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        //Если отрицательное, просим повторить ввод
        while (a < 0) {
            System.out.print("Не может быть меньше 0: ");
            a = in.nextInt();
        }
        in.close();

        int factorial = 1;
        for (int i = 1; a > 0; a--, i++) {
            factorial = factorial * i;
        }

        System.out.print("a! = " + factorial);
    }
}
