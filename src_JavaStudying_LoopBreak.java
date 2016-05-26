package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class LoopBreak {
    public static void main(String[] args)//the loop will be broken after i gets 15
    {
        int i = 0;
        while(true){
            if(i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("мы вышли из цикла");
    }
}
