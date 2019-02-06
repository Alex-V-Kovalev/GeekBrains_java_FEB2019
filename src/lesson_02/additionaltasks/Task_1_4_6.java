package lesson_02.additionaltasks;

public class Task_1_4_6 {
    public static void main(String[] args) {
        int ARRAY_SIZE = 16;
        boolean[][] field = new boolean[ARRAY_SIZE][ARRAY_SIZE];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = Math.random() > 0.5;
            }
        }

        printBooleanTable(field);
    }

    public static void printBooleanTable(boolean[][] array) {
        int maxRowLength = 0;
        for (boolean[] row : array) {
            int currentLength = row.length;
            if (maxRowLength < currentLength)
                maxRowLength = currentLength;
        }
        System.out.print("\\\t");
        for (int i = 0; i < maxRowLength; i++) {
            System.out.print("" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print("" + i + "\t");
            for (boolean element : array[i]) {
                System.out.print((element ? "*" : "") + "\t");
            }
            System.out.println();
        }

    }

}
