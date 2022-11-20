/*
В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.

После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое число,
то программа продолжает спрашивать у пользователя два числа и умножать их.
*/

import java.util.Scanner;

public class Multiplication2 {
    public static void main(String[] args) {

        int answer = 0;
        Scanner dig = new Scanner(System.in);

        while (answer != 1) {

            System.out.print("Введите первое число: ");
            int a = dig.nextInt();
            System.lineSeparator();
            System.out.print("Введите второе число: ");
            int b = dig.nextInt();
            System.lineSeparator();

            System.out.println(a * b);

            System.out.print("Чтобы закончить введите 1: ");
            answer = dig.nextInt();

        }

        dig.close();
    }
}
