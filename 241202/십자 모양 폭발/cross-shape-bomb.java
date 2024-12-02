import java.util.Scanner;

public class Main {

    static int n;
    static int r;
    static int c;
    static int[][] arr;
    static final int BLANK = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();
        bomb();
        shift();
        print();
    }

    public static void bomb() {
        int value = arr[r][c];
        int rowStart = r - (value - 1) >= 1 ? r - (value - 1) : 1;
        int rowEnd = r + (value - 1) <= n ? r + (value - 1) : n;
        int colStart = c - (value - 1) >= 1 ? c - (value - 1) : 1;
        int colEnd = c + (value - 1) <= n ? c + (value - 1) : n;

        // row 삭제
        for(int i = rowStart; i <= rowEnd; i++) {
            arr[i][c] = BLANK;
        }

        // col 삭제
        for(int i = colStart; i <= colEnd; i++) {
            arr[r][i] = BLANK;
        }
    }

    public static void shift() {
        int[][] temp = new int[n+1][n+1];

        for(int col = 1; col <= n; col++) {
            int tempRow = n;
            for(int row = n; row >= 1; row--) {
                if(arr[row][col] != BLANK) {
                    temp[tempRow][col] = arr[row][col];
                    tempRow--;
                }
            }
        }

        arr = temp;
    }

    public static void input() {
        n = sc.nextInt();
        arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        r = sc.nextInt();
        c = sc.nextInt();
    }

    public static void print() {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}