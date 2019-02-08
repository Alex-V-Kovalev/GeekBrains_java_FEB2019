package lesson_03;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        boolean letsGame = true;
        while (letsGame){
            Random rnd = new Random();
            Scanner scanner = new Scanner(System.in);
            int guessNumber = rnd.nextInt(10);
            System.out.println("Угадайте число от 0 до 9");
            for (int i = 0; i < 3; i++) {
                int userNumber;
                System.out.print("Попытка " + (i+1) + ". Введите число: ");
                userNumber = scanner.nextInt();
                if (userNumber < guessNumber)
                    System.out.println("Ваше число меньше загаданного! Попробуйте еще раз...");
                else if (userNumber > guessNumber)
                    System.out.println("Ваше число больше загаданного! Попробуйте еще раз...");
                else {
                    System.out.println("Поздравляю! Вы отгадали!!!");
                    break;
                }
            }
            System.out.println();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            letsGame = scanner.nextInt() == 1;
        }
    }
}
