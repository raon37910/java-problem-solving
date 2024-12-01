import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int q;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for(int i = 0; i < q; i++) {
            int row = sc.nextInt();
            String dir = sc.next();
            wind(row-1, dir);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void wind(int row, String dir) {
        if(dir.equals("R")) {
            shiftLeft(row);
        } else {
            shiftRight(row);
        }

        String topDir = dir.equals("L") ? "R" : "L";
        int topRow = row-1;

        while(topRow > 0 && canShift(topRow+1, topRow)) {
            if(topDir.equals("R")) {
                shiftLeft(topRow);
            } else {
                shiftRight(topRow);
            }

            topRow -= 1;
            topDir = topDir.equals("L") ? "R" : "L";
        }

        String bottomDir = dir.equals("L") ? "R" : "L";
        int bottomRow = row + 1;

        while(bottomRow < n && canShift(bottomRow-1, bottomRow)) {
            if(bottomDir.equals("R")) {
                shiftLeft(bottomRow);
            } else {
                shiftRight(bottomRow);
            }

            bottomRow += 1;
            bottomDir = bottomDir.equals("L") ? "R" : "L"; // c
        }
    }

    public static boolean canShift(int row1, int row2) {
        for(int i = 0; i < m; i++) {
            if(arr[row1][i] == arr[row2][i]) {
                return true;
            }
        }

        return false;
    }

    public static void shiftLeft(int row) {
        int temp = arr[row][0];

        for(int i = 0; i < m-1; i++) {
            arr[row][i] = arr[row][i+1];
        }

        arr[row][m-1] = temp;
    }

    public static void shiftRight(int row) {
        int temp = arr[row][m-1];

        for(int i = m-1; i >= 1; i--) {
            arr[row][i] = arr[row][i-1];
        }

        arr[row][0] = temp;
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}