import java.util.Scanner;

public class Main {

    static int n;
    static int t;
    static int [][] arr;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        input();

        for(int i = 0; i < t; i++) {
            shift();
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shift() {
        // 1행에 있는 친구들을 우측으로 한 칸 밀어낸다.
        int tempRow1 = arr[0][n-1];

        for(int i = n-1; i >= 1; i--) {
            arr[0][i] = arr[0][i-1];
        }

        // 2행에 있는 친구들을 왼쪽으로 한 칸씩 땡긴다.
        int tempRow2 = arr[1][n-1];
        for(int i = n-1; i >= 1; i--) {
            arr[1][i] = arr[1][i-1];
        }

        arr[1][0] = tempRow1;
        arr[0][0] = tempRow2;
    }

    public static void input() {
        n = sc.nextInt();
        t = sc.nextInt();

        arr = new int[2][n];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}