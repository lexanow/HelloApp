/*
Написать программу, которая принимает строку с клавиатуры. Если строка == "Hi" - вывести в консоль "Hello",
если Bye - Good bye, если How are you - How are your doing. Если любая другая строка - вывести Unknown message.
Сделать через:
1)   if-else
*/

import java.util.Scanner;
public class HiGoodbye {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = in.nextLine();
        in.close();

        final String hi = "Hi";
        final String bye = "Bye";
        final String howau = "How are you";

        if (text.equals(hi)) {
            System.out.println("Hello");
        }
        else if (text.equals(bye)) {
            System.out.println("Good bye");
        }
        else if (text.equals(howau)) {
            System.out.println("How are your doing");
        }
        else {
            System.out.println("Unknown message");
        }

    }
}
