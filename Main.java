import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");

        Random random = new Random();

        int roulette = random.nextInt(6) + 1;

        if (roulette == 6) {
            System.out.println("Там была пуля");
        }
    }
}
