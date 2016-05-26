package JavaStudying;

import java.util.Scanner;

/**
 * Created by Admin on 26.05.2016.
 */
public class BogdanShedule {
    public static void main(String[] args) {
        System.out.println("Распорядок дня Богдана");
        System.out.println("Который час? Введите время на консоли");
        for (int i = 0; i < 13; i++) {

            Scanner scanner = new Scanner(System.in);
            int hour = scanner.nextInt();
            if (hour >= 0 && hour < 7) {
                System.out.println("Бегом спать!");
            } else if (hour == 7) {
                System.out.println("Подъем! Умываться и завтракать!");
            } else if (hour == 8) {
                System.out.println("Марш в школу!");
            } else if (hour > 8 && hour < 13) {
                System.out.println("Ты почему не на уроках?!");
            } else if (hour == 13) {
                System.out.println("Садись в машину, рассказывай, что получил.");
            } else if (hour == 14) {
                System.out.println("Мой руки и иди обедать!");
            } else if (hour > 14 && hour <= 17) {
                System.out.println("Делай уроки, сынок!");
            } else if (hour > 17 && hour < 20) {
                System.out.println("Ты сегодня сделаешь уроки, паразит?!");
            } else if (hour == 20) {
                System.out.println("Собери портфель на завтра!");
            } else if (hour == 21) {
                System.out.println("На горшок и спать!");
            } else if (hour >= 22 && hour <= 24) {
                System.out.println("Хватит трындеть с Даней! Завтра рано вставать!");
            } else
                System.out.println("Введите время корректно, например: 8");

            {
                continue;
            }
        }

    }
}
