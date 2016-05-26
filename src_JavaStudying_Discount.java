package JavaStudying;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 26.05.2016.
 */
public class Discount {
    public static void main(String[] args) throws Exception {
        double discount;
        System.out.println("Введите сумму покупки");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        long a = Integer.parseInt(sA);

        if (a <= 100 & a > 0) {
            discount = (a * 0.1);
            System.out.println("Ваша скидка составляет " + discount + " грн.");
        }
        if (a > 100 & a <= 200) {
            discount = (a * 0.2);
            System.out.println("Ваша скидка составляет " + discount + " грн.");
        }
        if (a > 200) {
            discount = (a * 0.3);
            System.out.println("Ваша скидка составляет " + discount + " грн.");
        }
        if (a <= 0) {
            System.out.println("Введите корректную сумму!");
        }
        if (a > 10000) {
            System.out.println("Подождите минуточку, сейчас мы запакуем магазин!");
        }
        System.out.println("Спасибо за покупку!");
    }

}
