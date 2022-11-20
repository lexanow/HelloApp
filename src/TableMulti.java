/*
Напишите программу, которая выводит на консоль таблицу умножения
 */
public class TableMulti {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int a = i * j;
                System.out.printf("%d  ", a);
            }
            System.out.println();
        }
    }
}
