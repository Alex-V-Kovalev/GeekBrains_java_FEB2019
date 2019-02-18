package lesson_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GameXO {
    private static final int SIZE = 3;
    private static String[][] gameField = new String[SIZE][SIZE];
    private static final String DOT_EMPTY = " ";
    private static final String DOT_X = "X";
    private static final String DOT_O = "O";
    private static int countOpenCells = SIZE * SIZE;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Random random = new Random();
    private static int[] lastTurn = new int[2];

    public static void main(String[] args) throws Exception {
        boolean isHumanTurn = true;
        initField();
        printField();
        do {
            if (isHumanTurn)
                turnHuman();
            else {
                turnComp();
            }
            printField();
            if (testWinner(isHumanTurn ? DOT_X : DOT_O))
                win(isHumanTurn);
            isHumanTurn = !isHumanTurn;

        } while (countOpenCells > 0);

    }

    private static void win(boolean isHumanTurn) {
        System.out.println(isHumanTurn ? "Поздравляем с победой!!" : "Вы прогирали...");
//        System.out.println("Еще одну партию?");
        System.exit(0);
    }

    private static boolean testWinner(String dot) {
        if (gameField[0][0].equals(dot) && gameField[0][1].equals(dot) && gameField[0][2].equals(dot)) return true;
        if (gameField[1][0].equals(dot) && gameField[1][1].equals(dot) && gameField[1][2].equals(dot)) return true;
        if (gameField[2][0].equals(dot) && gameField[2][1].equals(dot) && gameField[2][2].equals(dot)) return true;
        if (gameField[0][0].equals(dot) && gameField[1][0].equals(dot) && gameField[2][0].equals(dot)) return true;
        if (gameField[0][1].equals(dot) && gameField[1][1].equals(dot) && gameField[2][1].equals(dot)) return true;
        if (gameField[0][2].equals(dot) && gameField[1][2].equals(dot) && gameField[2][2].equals(dot)) return true;
        if (gameField[0][0].equals(dot) && gameField[1][1].equals(dot) && gameField[2][2].equals(dot)) return true;
        if (gameField[2][0].equals(dot) && gameField[1][1].equals(dot) && gameField[0][2].equals(dot)) return true;
        return false;
    }

    private static void turnComp() {
        int x;
        int y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!gameField[y][x].equals(DOT_EMPTY));
        gameField[y][x] = DOT_O;
        countOpenCells--;
        lastTurn[0] = x;
        lastTurn[1] = y;
        System.out.println(x + " " + y);
    }

    private static void turnHuman() throws Exception {
        int x;
        int y;
        System.out.print("Введите координаты х, у:");
        x = Integer.parseInt(reader.readLine()) - 1;
        y = Integer.parseInt(reader.readLine()) - 1;
        gameField[y][x] = DOT_X;
        countOpenCells--;
        lastTurn[0] = x;
        lastTurn[1] = y;

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
                System.out.print(" " + gameField[i][j] + " |");
            }
            System.out.println();
            System.out.println(delimiter);
        }
    }

    private static void initField() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                gameField[i][j] = DOT_EMPTY;
        countOpenCells = SIZE * SIZE;
    }


}
