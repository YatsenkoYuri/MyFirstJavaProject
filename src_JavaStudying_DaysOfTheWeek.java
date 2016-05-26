package JavaStudying;

import java.util.Scanner;

/**
 * Created by Admin on 26.05.2016.
 */
public class DaysOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели (1-7)");
        Scanner scanner = new Scanner(System.in);
        int dayString = scanner.nextInt();
        {
            switch (dayString) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Нет такого дня!");
                    break;

            }
        }
    }
}


