package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class Recursion {//ToDo
    public static void main(String[] args) {

    }
    public int values[];
    StringBuilder sb = new StringBuilder();

    public Recursion (int i){
        values = new int [i];
    }
    public String printArray (int i){
        if (i==0) {
            return "";
        } else {
            printArray(i-1);
        }
        String output = "[" + (i-1)+"]" + values [i-1] + "\n";
        sb.append(output);
        return sb.toString();
    }

}
