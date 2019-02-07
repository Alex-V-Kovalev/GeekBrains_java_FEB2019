package lesson_02.additionaltasks;

import java.util.Arrays;

public class Deal {
    private static int index;

    public static void main(String[] args) {
        int deal;
        try {
            deal = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.err.println("Неверный аргумент вызова программы\n" +
                    "Попробуйте: Deal <целое_число_раздач>");
            return;
        }

        String[] cards = new String[52];

        deckInit(cards);

        System.out.println(Arrays.toString(cards));

        deckSuffle(cards);

        System.out.println(Arrays.toString(cards));

        System.out.println("\nНачинаем раздачу:");
        for (int i = 0; i < deal; i++) {
            System.out.print("" + (i + 1) + " рука: ");
            for (int j = 0; j < 5; j++) {
                String delim;
                delim = j < 4 ? ", " : "";
                System.out.print(cards[index++] + delim);
            }
            System.out.println();
        }


    }

    private static void deckInit(String[] cards) {
        for (int i = 0; i < cards.length; i++) {
            String vol = "";
            switch (i / 13) {
                case 0:
                    vol = "♥️";
                    break;
                case 1:
                    vol = "♣️";
                    break;
                case 2:
                    vol = "♦️";
                    break;
                case 3:
                    vol = "♠️";
                    break;
            }

            if (i % 13 < 9) vol += (i % 13 + 2);
            if (i % 13 == 9) vol += "В";
            if (i % 13 == 10) vol += "Д";
            if (i % 13 == 11) vol += "К";
            if (i % 13 == 12) vol += "Т";

            cards[i] = vol;
        }
        index = 0;
    }

    public static void deckSuffle(String[] cards) {
        int count = cards.length;
        for (int i = 0; i < count; i++) {
            int rnd = (int) (Math.random() * (count - i) + i);
            String tmp = cards[rnd];
            cards[rnd] = cards[i];
            cards[i] = tmp;
        }
        index = 0;
    }
}
