/*
Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли заданный
прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int rectLength = in.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int rectWidth = in.nextInt();
        in.close();

        // Создаем линии
        String rectLineEdge = " "; //Первый элемент линии
        String rectLineMid = "|";

        for (int i = 1; i <= rectLength; i++) { //Внутренняя часть линий
            rectLineEdge += "-";
            rectLineMid += " ";
        }

        //rectLineEdge += " ";
        rectLineMid += "|"; //Последний элемент линии

        System.out.println(rectLineEdge); //Выводим первую линию

        for (int i = 2; i != rectWidth; i++) {
            System.out.println(rectLineMid);  //Выводим внутренние линии
        }

        System.out.println(rectLineEdge); //Выводим последнюю линию

    }
}


