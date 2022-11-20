/*
В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек,
смертность - 8 человек. Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
Рассчитайте, какая численность населения будет через 10 лет, учитывая,
что рождаемость не может быть меньше 7 человек на 1000 человек,
а смертность не может быть меньше 6 человек на 1000 человек.
 */

public class MetanitCycle2 {
    public static void main(String[] args) {

        int pop = 10000000;
        int born = 14;
        int death = 8;

        for (int i = 1; i !=10; i++) {
            pop += (pop/1000) * (born - death);
            while (born != 7) {
                born--;
            }
            while (death != 6) {
                death--;
            }
        }
        System.out.println("За 10 лет население достигнет " + pop + " человек");
    }
}
