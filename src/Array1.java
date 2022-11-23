/*
Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.

Вариант 1: не используя переменную типа String;
Вариант 2: предварительно собрав значения массива в переменную типа String.

Подсказка для варианта 2: создать пустую строку можно так: String s = “”;
 */

public class Array1 {
    public static void main(String[] args) {

        char [] name = {'A','l','e','k','s','e','y'};
        System.out.printf("%c%c%c%c%c%c%c", name [0], name [1], name [2], name [3], name [4], name [5], name [6]);
        System.out.print(System.lineSeparator());

        for (char i : name) {
            System.out.print(i);
        }

        System.out.print(System.lineSeparator());

        String s = "";

        for (char i : name) {
            s += i;
        }

        System.out.print(s);
    }
}
