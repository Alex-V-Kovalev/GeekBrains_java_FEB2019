package Lesson_02.Task_06;

public class CheckBalance {
    public static void main(String[] args) {

        System.out.println(checkBalace(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalace(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalace(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}));
        System.out.println(checkBalace(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0}));

    }

    private static boolean checkBalace(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (sumArray(array, i, "L") == sumArray(array, i + 1, "R"))
                return true;
        }
        return false;
    }

    private static int sumArray(int[] array, int index, String direction) {
        if (direction.equals("L")){
            if (index == 0)
                return array[index];
            else
                return array[index] + sumArray(array, index- 1, "L");

        } else {
            if (index == array.length - 1)
                return array[index];
            else
                return array[index] + sumArray(array, index + 1, "R");
        }
    }
}
