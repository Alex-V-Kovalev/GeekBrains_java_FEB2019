package lesson_02.Task_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OffsetArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размерность массива: ");
        int volume = Integer.parseInt(reader.readLine());
        int[] array = new int[volume];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Создали массив: \t\t" + Arrays.toString(array));

        System.out.println();
        System.out.print("Введите величину смещения элементов массива: ");
        int offset = Integer.parseInt(reader.readLine());
        offsetArray(array, offset);
        System.out.println();
        System.out.println("Массив после смещения: \t" + Arrays.toString(array));
    }

    private static void offsetArray(int[] array, int offset) {
        int size = array.length;
        for (int i = 0; i < offset; i++) {
            int temp = array[size - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = temp;
        }
    }
}
