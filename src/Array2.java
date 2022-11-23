/*
Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
Вывести на экран сумму каждого значения с предыдущим. Предыдущим значением для 0го элемента считать последнее значение массива.
 */

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        int[] intArray = new int[5];

        Scanner in = new Scanner(System.in);

        int lenght = intArray.length;

        for (int i = 0; i < lenght; i++) {
            System.out.print("Введите " + i + 1 + " символ массива: ");
            intArray[i] = in.nextInt();
        }

        in.close();

        int sum;
        for (int i = 0; i < lenght; i++) {

            if (i == 0) {
                sum = intArray[i] + intArray[lenght - 1];
            } else {
                sum = intArray[i] + intArray[i - 1];
            }

            System.out.println(sum);
        }
    }
}
