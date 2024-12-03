import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int k;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        input();

        for(int row = 1; row <= n-1; row++) {
            boolean flag = true;

            // 비어 있어서 내려 갈 수 있는지?
            for(int col = k; col <= k + m - 1; col++) {
                if(arr[row][col] == 1) {
                    flag = false;
                    break;
                }
            }

            // 비어 있어서 내려 갈 수 있다면
            if(flag) {
                boolean end = false;
                // 다음칸에 접근을 못 해서 멈춰야 하는지?
                for(int col = k; col <= k + m - 1; col++) {
                    if(arr[row + 1][col] == 1) {
                        end = true;
                        break;
                    }
                }

                if(end) {
                    for(int col = k; col <= k + m - 1; col++) {
                        arr[row][col] = 1;
                    }
                    break;
                }
                // row = n - 1 일때 end가 False라면 바닥이라는 뜻임
                if (row == n - 1) {
                    for(int col = k; col <= k + m - 1; col++) {
                        arr[row + 1][col] = 1;
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n+1][n+1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}