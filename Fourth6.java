import java.util.Random;
import java.util.Scanner;

public class Fourth6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(3) + 1;
        int num2 = rand.nextInt(3) + 1;
        int num3 = rand.nextInt(3) + 1;
        int efforts  = 0;
        Scanner scanner = new Scanner(System.in);
        while (efforts < 2) {
            efforts++;
            System.out.print("Введіть три цілі числа з проміжку [1; 3] ");
            int guess1 = scanner.nextInt();
            int guess2 = scanner.nextInt();
            int guess3 = scanner.nextInt();
            if (guess1 == num1 && guess2 == num2 && guess3 == num3) {
                System.out.println("Вітаємо! Ви відгадали правильну послідовність чисел.");
                return;
            } else {
                System.out.println("На жаль, ви не відгадали правильну послідовність чисел.");
            }
        }
        System.out.println("Гра закінчилася. Правильна послідовність чисел: " + num1 + " " + num2 + " " + num3);
    }
}
