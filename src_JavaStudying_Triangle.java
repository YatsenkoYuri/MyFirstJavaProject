package JavaStudying;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 26.05.2016.
 */
public class Triangle {
    public static void main(String[] args) throws Exception
    {
        //если сумма двух сторон треугольника больше третьей, значит он существует
        System.out.println("Input triangle`s sides length");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());

        int b = Integer.parseInt(reader.readLine());

        int c = Integer.parseInt(reader.readLine());
        if (a >= (b + c) || b >= (a + c) || c >= (a + b))
            System.out.println("Треугольник не существует.");
        else
            System.out.println("Треугольник существует.");

    }
}
