package lesson_02.additionaltasks;

import java.util.Arrays;

public class Task_1_4_13 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] c = new int[][]{{1}, {2, 3, 4, 5, 6}, {7, 8, 9}};
        int[][] resA;
        int[][] resAB;
        int[][] resAC;
        int[][] resB;
        int[][] resBC;
        int[][] resC;

        resA = copyArray_mA(a);
        System.out.println(Arrays.deepToString(resA));
        resB = copyArray_mB(b);
        System.out.println(Arrays.deepToString(resB));
        resAB = copyArray_mB(a);
        System.out.println(Arrays.deepToString(resAB));
        resC = copyArray_mC(c);
        System.out.println(Arrays.deepToString(resC));
        resBC = copyArray_mC(b);
        System.out.println(Arrays.deepToString(resBC));
        resAC = copyArray_mC(a);
        System.out.println(Arrays.deepToString(resAC));


    }

    public static int[][] copyArray_mA(int[][] a) {
        int sizeArray = a.length;
        int[][] result = new int[sizeArray][sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                result[i][j] = a[i][j];
            }
        }

        return result;
    }

    public static int[][] copyArray_mB(int[][] a) {
        int row = a.length;
        int column = a[0].length;
        int[][] result = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j];
            }
        }
        return result;
    }

    public static int[][] copyArray_mC(int[][] a) {
        int row = a.length;
        int column;
        int[][] result = new int[row][];

        for (int i = 0; i < row; i++) {
            column = a[i].length;
            result[i] = new int[column];
            for (int j = 0; j < column; j++) {
                result[i][j] = a[i][j];
            }
        }
        return result;
    }
}

