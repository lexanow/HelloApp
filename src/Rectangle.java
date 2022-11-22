/*
Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли заданный
прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника l: ");
        int l = Math.abs(in.nextInt());
        System.out.print("Введите ширину прямоугольника w: ");
        int w = Math.abs(in.nextInt());
        in.close();

        String RectLine = "";
        for (int wi = 1; wi <= w; wi++) { //Внешний цикл для вывода строк

            if (wi == 1 ^ wi == w) { //Условие для определения типа строки: первая/последняя, внутренняя
                RectLine = "*";
                for (int li = 2; li < l; li++) { //Цикл для заполнения строки
                    RectLine += "-";
                }
                RectLine += "*";

                System.out.println(RectLine);

            } else {
                RectLine = "|";
                for (int li = 2; li < l; li++) { //Цикл для заполнения строки
                    RectLine += " ";
                }
                RectLine += "|";

                System.out.println(RectLine);
            }
        }
    }
}


