/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму
вклада с учетом начисления процентов за каждый месяц.

Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */
import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float contribution = Math.abs(in.nextFloat());
        System.out.print("Введите срок вклада: ");
        int term = in.nextInt();
        in.close();

        for (int i = 0; i < term; i++) {
            contribution *= 1.07;
        }

        System.out.println("Сумма вклада за " + term + " месяцев равна " + contribution);
    }
}
