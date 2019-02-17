package lesson_03;

import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Я знаю несколько английских слов.\n\n" +
                "Вот мой словарный запас:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(words[i * 5 + j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nДавай поиграем в Угадайку? Отгадай, какое слово я загадал?\n");

        String guessWord = words[new Random().nextInt(25)];

//        System.out.println(guessWord);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи свой вариант: ");
        String userWord = scanner.nextLine().toLowerCase();
        char[] maskWord = "###############".toCharArray();
        int minWordLength;

        while (!userWord.equals(guessWord)) {
            System.out.println();
            minWordLength = guessWord.length() < userWord.length() ? guessWord.length() : userWord.length();
            for (int i = 0; i < minWordLength; i++) {
                maskWord[i] = (userWord.charAt(i) == guessWord.charAt(i)) ? userWord.charAt(i) : '#';
            }
            System.out.println(String.valueOf(maskWord));

            System.out.print("Попробуй еще раз: ");
            userWord = scanner.nextLine().toLowerCase();
        }

        System.out.println("Поздравляю! Ты отгадал!!!");
    }
}
