package lesson_02.additionaltasks;

import java.util.Arrays;

public class Task_1_4_4 {
    public static void main(String[] args) {
        String[] strings = new String[]{"И", "в", "ночи", "январской", "беззвездной", "Сам", "дивясь", "небывалой",
                "судьбе", "Возвращенный", "из", "смертной", "бездны", "Ленинград", "салютует", "себе"};

        System.out.println(Arrays.toString(strings));
        int arrLength = strings.length;
        int numIteration = arrLength / 2;
        for (int i = 0; i < numIteration; i++) {
            String temp = strings[i];
            strings[i] = strings[arrLength - 1 - i];
            strings[arrLength - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(strings));
    }
}
