package JavaStudying;

/**
 * Created by Admin on 26.05.2016.
 */
public class Concatenation {
    public static void main(String[] args) {
        String[] animals = {"Аля ", "Рексона ", "Матроскин "};
        String[] action = {"грызет ", "прячет ", "ест "};
        String[] food = {"кость", "сухарик", "рыбу"};
        for (int i = 0; i <= 2; i++) {
            String result = animals[i] + action[i] + food[i];
            System.out.println(result);
        }
    }
}
