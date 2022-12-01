/*
Вычислить из записать в массив первые 10 простых чисел.

Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.

Вывести в консоль сумму всех элементов полученного массива.
 */

public class Array3 {
    public static void main(String[] args) {

        int[] intArray = new int[10];
        int digit = 2; // Число которое исследуется на "простоту"
        int x = 0;     // Переменная адреса элемента в массиве intArray
        int a = 0;     // Переменная счетчика делитей

        while (intArray[intArray.length - 1] == 0) { // Пока последний элемент массива == 0 выполняем

            for (int i = 1; i <= digit; i++) {

                if (digit % i == 0) {    // Считаем количество делителей
                    a++;
                }
            }

            if (a == 2) {               // Т.к. простого числа не может быть больше 2-х,
                intArray[x] = digit;    // то записываем в массив только числа у которых их два.
                x++;                    // Увеличиваем адрес элемент массива на 1
            }

            digit++;                    // Увеличиваем число для которого считаем количество делителей
            a = 0;                      // Обнуляем счетчик делителей
        }

        int sum = 0;

        for (int i : intArray) { // Считаем сумму всех элементов массива
            sum += i;
        }

        System.out.println(sum);
    }
}

