package JavaStudying;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Admin on 26.05.2016.
 */
public class DotStop {
    public static void main(String[] args) throws IOException {
        for (; ; ) {
            System.out.println("Введите любой символ, или точку для выхода");
            Scanner scanner = new Scanner(System.in);
            char c = (char) System.in.read();
            if (c == '.') break;

            System.out.println("Вы ввели " + c);
        }
        System.out.println("Цикл завершен");
    }
}
