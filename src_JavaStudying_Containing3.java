package JavaStudying;

import java.util.Scanner;

/**
 * Created by Admin on 26.05.2016.
 */
public class Containing3 {
    public static void main(String[] args) {
        //If n*n contains "3"
        System.out.println("Input n");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int numb = n * n;
        System.out.println(numb);
        String strLong = Long.toString(numb);
        if (strLong.contains("3")) {
            System.out.println("Contains 3");
        } else System.out.println("Doesn`t contain 3");

    }
}
