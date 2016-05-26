package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class Array {
    public static void main(String[] args)
    {
        int number = 10; //            примитивный тип данных          =10
        int[] numbers = new int[5]; // ссылочный тип данных (массив)   = numbers
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++)
        {
            System.out.println(numbers1[i]);
        }
    }
}

