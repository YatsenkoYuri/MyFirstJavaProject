package JavaStudying;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 26.05.2016.
 */
public class NumOfDigits {
    public static void main(String[] args) throws Exception {
        System.out.println("введите целое положительное число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());

        int num = (int) Math.log10(x) + 1;
        System.out.println("количество разрядов: " + num );

    }
}
