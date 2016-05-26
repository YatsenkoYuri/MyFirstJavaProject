package JavaStudying;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 26.05.2016.
 */
public class SumOfDigits {
    public static void main(String[] args) throws Exception {
        System.out.println("Считаем количество разрядов и сумму цифр в числе");
        System.out.println("Введите целое положительное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int num = (int) Math.log10(i) + 1;
        int sum = 0;
        while (i > 0) {
            int r = i % 10;
            sum = sum + r;
            i = i / 10;
        }
        System.out.println("количество разрядов: " + num );
        System.out.println("Сумма цифр в числе = " + sum);
    }
}
