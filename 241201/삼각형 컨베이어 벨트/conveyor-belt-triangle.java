import java.util.Scanner;

public class Main {

    static int n;
    static int t;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for(int i = 0; i < t; i++) {
            shift();
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void shift() {
        // 1행 오른쪽으로 한 칸 쉬프트
        int temp1 = arr[0][n-1];

        for(int i = n-1; i >= 1; i--) {
            arr[0][i] = arr[0][i-1];
        }

        // 2행 오른쪽으로 한 칸 쉬프트
        int temp2 = arr[1][n-1];
        for(int i = n-1; i >= 1; i--) {
            arr[1][i] = arr[1][i-1];
        }

        // 3행 오른쪽으로 한 칸 쉬프트
        int temp3 = arr[2][n-1];

        for(int i = n-1; i >= 1; i--) {
            arr[2][i] = arr[2][i-1];
        }

        arr[0][0] = temp3;
        arr[1][0] = temp1;
        arr[2][0] = temp2;
    }

    public static void input() {
        n = sc.nextInt();
        t = sc.nextInt();
        arr = new int[3][n];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}