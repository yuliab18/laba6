import java.util.Random;
public class Third6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(101);
        int digits = String.valueOf(num).length();
        System.out.println("Згенероване число: " + num);
        System.out.println("Кількість цифр у числі: " + digits);
    }
}
