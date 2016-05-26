package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class MultiplicationTableViaFor {
    public static void main(String[] args) {
        for (int a =1; a<=10; a++){
            for (int b=1; b<=10; b++){
                System.out.print(a * b + "\t");
            }
            System.out.println();
        }
    }
}
