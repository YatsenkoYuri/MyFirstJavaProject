package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class MultiplicationTableViaWhile {
    public static void main(String[] args) {
        int a=0;
        while (a<10){
            System.out.println();
            a++;
            int b=1;
            while (b<10){
                System.out.print(a*b+"\t");
                b++;
            }
        }
    }
}
