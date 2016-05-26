package EggVsChicken;

/**
 * Created by Admin on 26.05.2016.
 */
public class EggVoice extends Thread {
    public void run(){
        for(int i = 0; i<5; i++){
            try {
                sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("яйцо!");

        }
    }
}
