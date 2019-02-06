package lesson_02.task_01;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Первичные значения массива: \t\t" + Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            switch (intArray[i]) {
                case 0:
                    intArray[i] = 1;
                    break;
                case 1:
                    intArray[i] = 0;
                    break;
            }
        }
        System.out.println("Значения массива после обработки: \t" + Arrays.toString(intArray));

    }
}
