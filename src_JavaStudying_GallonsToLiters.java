package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class GallonsToLiters {
    public static void main(String[] args) {
        double gallons, liters;
        int counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons = " + liters + " liters");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;

            }
        }
    }
}
