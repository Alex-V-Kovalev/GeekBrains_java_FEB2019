package Lesson_02.Task_03;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Создали и инициализировали массив: \t" + Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++)
            if (intArray[i] < 6) intArray[i] *= 2;
        System.out.println("Элементы массива меньше 6 удвоили: \t" + Arrays.toString(intArray));
    }
}
