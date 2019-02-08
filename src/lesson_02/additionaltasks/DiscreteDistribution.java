package lesson_02.additionaltasks;

import java.util.Random;

public class DiscreteDistribution {
    public static void main(String[] args) {

        if (args.length < 1) printErrMsg();

        int[] ints = new int[args.length];
        int sum = 0;
        try {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(args[i]);
                sum += ints[i];
            }
        } catch (Exception e) {
            printErrMsg();
            return;
        }
        Random rnd = new Random();
        for (int i : ints)
            if (rnd.nextDouble() >= (double) i / sum) System.out.println("" + i);
    }

    private static void printErrMsg() {
        System.err.println("Неправильный вызов программы!\n" +
                "Вызывайте: DiscreteDistibution <число1> <число2> ... <числоN>");
    }
}
