package Lesson_02.Task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SquareIntArray {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int volume = 0;
        boolean onceMore;
        do {
            try {
                System.out.print("Введите размерность квадратного массива и нажмите <Enter>: ");
                volume = Integer.parseInt(reader.readLine());
                if (volume < 1) throw new Exception();
                onceMore = false;
            } catch (Exception e) {
                System.err.println("Будьте внимательны! Надо ввести целое число, больше 0");
                onceMore = true;
            }
        } while (onceMore);

        int[][] intArray = new int[volume][volume];

        System.out.println("Создали массив:");
        printSquareArray(intArray);

        if (intArray.length == intArray[1].length)
            for (int i = 0; i < intArray.length; i++) {
                if (i != intArray.length - i - 1)
                    intArray[intArray.length - i - 1][i] = 1;
                intArray[i][i] = 1;
            }

        System.out.println();
        System.out.println("Массив после заполнения диагоналей:");
        printSquareArray(intArray);
    }

    private static void printSquareArray(int[][] squareArray) {

        for (int[] ints : squareArray) System.out.println(Arrays.toString(ints));
    }
}
