/*
Ввести с клавиатуры целое число (Число 2). Для каждого из чисел от 1 до 10 выполнить:
Если число1 четное, вывести сумму двух чисел (пр.1), если нет - разность(пр.2).
Также если числа равны - вывести надпись "числа равны!".

пр1.: "Число1 + Число2 = Сумма", где число1 - значение 1го числа (от 1 до 10),
число2 - значение введенного с клавиатуры числа, Сумма - результат сложения.
пр2.: "Число1 - Число2 = Разность", где число1 - значение 1го числа (от 1 до 10),
число2 - значение введенного с клавиатуры числа, Разность - результат вычитания.
 */

import java.util.Scanner;

public class ChetNechet2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = (in.nextInt());
        in.close();

        for (int i = 1; i <= 10; i++) { //Внешний цикл работы с числами 1 - 10

            if (i == a) {
                System.out.println(i + a);
                System.out.println("Числа равны!");

            } else if (i % 2 == 0) {
                System.out.println(i + a);
            } else {
                System.out.println(i - a);
            }
        }
    }
}
