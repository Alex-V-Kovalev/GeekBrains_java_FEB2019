package lesson_04;

public class GameXO {
    private static final int SIZE = 3;
    private static String[][] gameField = new String[SIZE][SIZE];
    private static final String DOT_EMPTY = " ";
    private static final String DOT_X = "X";
    private static final String DOT_O = "O";
    private static int countOpenCells = SIZE * SIZE;


    public static void main(String[] args) {
        initField();
        printField();

    }

    private static void printField() {
        StringBuilder header = new StringBuilder("   |");
        for (int i = 0; i < SIZE; i++) {
            header.append(" ");
            header.append(i + 1);
            header.append(" |");
        }
        System.out.println(header);
        StringBuilder delimiter = new StringBuilder();
        for (int i = 0; i <= SIZE; i++) {
            for (int j = 0; j < 3; j++)
                delimiter.append("-");
            delimiter.append("+");
        }
        System.out.println(delimiter);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + (i + 1) + " |");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + gameField[j][i] + " |");
            }
            System.out.println();
            System.out.println(delimiter);
        }
    }

    private static void initField() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                gameField[j][i] = DOT_EMPTY;
        countOpenCells = SIZE * SIZE;
    }


}
