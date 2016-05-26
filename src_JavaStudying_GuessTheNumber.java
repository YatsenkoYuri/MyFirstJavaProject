package JavaStudying;

import java.util.Scanner;

/**
 * Created by Admin on 26.05.2016.
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 9 + 1);
//        System.out.println(n);
        System.out.println("Введите целое число от 1 до 9");
        for (int i = 0; i <= 3; ++i) {
            if (i >= 3) {
                System.out.println("Все, попытки закончились!");
                System.out.println("Было загадано число " + n);
            }
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x <= 0 || x >= 10) {
                System.out.println("Я сказал целое число от 1 до 9! Поехали сначала.");
                break;
            } else if (x == n) {
                System.out.println("Ура! Вы угадали.");
                break;
            }
            if (x > n) {
                System.out.println("Многовато будет!");
            } else if (x < n) {
                System.out.println("Маловато будет!");
            }
        }
    }
}

