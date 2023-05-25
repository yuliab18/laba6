import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(41) - 20;
        System.out.println(number);
    }
}
