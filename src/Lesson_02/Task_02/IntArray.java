package Lesson_02.Task_02;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] intArray = new int[8];

        System.out.println("Создали массив: \t\t\t" + Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) intArray[i] = i * 3;
        System.out.println("Заполненый массив: \t\t\t" + Arrays.toString(intArray));
    }
}
