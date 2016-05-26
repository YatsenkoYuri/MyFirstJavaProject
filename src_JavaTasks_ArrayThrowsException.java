package JavaTasks;

/**
 * Created by Admin on 26.05.2016.
 */
public class ArrayThrowsException {//исключаем деление на ноль
    public static void main(String[] args) throws Exception{
        double[] a = new double[5];
        for (int i = 0; i <= 4; i++) {
            a[i] = i;
            try {
                double b = 5/i;
                System.out.println("5/"+i+"=" + b);
            } catch (ArithmeticException e) {
                System.out.println("An invalid arithmetic operation (zero)");
            }
        }
    }
}
