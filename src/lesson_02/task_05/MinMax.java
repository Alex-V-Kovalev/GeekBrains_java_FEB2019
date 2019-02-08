package lesson_02.task_05;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] intArray = new int[15];

        for (int i = 0; i < intArray.length; i++) intArray[i] = (int) (Math.random() * 100);
        System.out.println("Создали и инициализировали массив:" + Arrays.toString(intArray));

        int min, max;
        min = max = intArray[0];
        for (int i :
                intArray) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }
}
