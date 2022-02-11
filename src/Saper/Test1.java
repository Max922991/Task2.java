package Saper;

import java.util.Random;

public class Test1 {

    private static final int HEIGHT = 10;
    private static final int WIDTH = 10;
    private static final int MINES_COUNT = 10;
    private static final int MINE = 1000;
    private static final int EMPTY = 0;


    public static void main(String[] args) {
        boolean win = play();
        if (win) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Try again");
        }
    }

    private static boolean play() {
        int[][] board = generateBoard();
        printBoard(board);
        return true;
    }

    private static void printBoard(int[][] board) {
        System.out.printf("   ");
        for (char i = 'A'; i < 'A' + WIDTH; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < WIDTH; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        System.out.print(" .");
                        break;
                    case MINE:
                        System.out.print(" *");
                        break;
                    default:
                        System.out.printf("%2d", board[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static int[][] generateBoard() {
        int[][] board = placeMines();
        return calculateMines(board);
    }

    private static int[][] placeMines() {
        int[][] board = new int[HEIGHT][WIDTH];
        Random random = new Random();
        int mines = MINES_COUNT;
        while (mines > 0) {
            int x, y;
            do {
                x = random.nextInt(HEIGHT);
                y = random.nextInt(WIDTH);
            } while (board[x][y] == MINE);
            board[x][y] = MINE;
            mines--;
        }
        return board;
    }

    private static int[][] calculateMines(int[][] board) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if(board[i][j] == MINE){
                    continue;
                }
                board[i][j] = calculateMinesAround(board, i, j);
            }
        }
        return board;
    }
    private static int calculateMinesAround(int[][] board, int i, int j) {
        int mCount = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if(k < 0 || k >= HEIGHT || l < 0 || l >= WIDTH){
                    continue;
                }
                if(board[k][l] == MINE){
                    mCount++;
                }
            }
        }
        return mCount;
    }
}
