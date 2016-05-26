package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class Equals {
    public static class Put {
        int name;
        int surname;
        public Put(int name, int surname) {
            this.name = name;
            this.surname = surname;
        }
    }
    public static void main(String[] args) {
        Put a = new Put(2, 3);
        Put b = new Put(2, 3);
        System.out.println(a.equals(b));
    }
}
