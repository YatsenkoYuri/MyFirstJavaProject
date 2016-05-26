package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class LoopContinue {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 15; i++)
        {
            if (i % 2 == 0)
            {
                continue;
            }
            System.out.println("это нечетное число " + i);
        }
    }
}
