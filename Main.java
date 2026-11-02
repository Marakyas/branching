import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");

        Random random = new Random();

        int roulette = random.nextInt(6) + 1;

        switch (roulette){
            case 1,4,5:
                System.out.println("Выпало " + roulette + ", повезло. Ты жив");
                break;
            case 2,3,6:
                System.out.println("Выпало " + roulette + ", там была пуля. Ты 200");
        }


    }
}
