import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][n];
        // 입력
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k <= 2*(n-1); k++) {
                    int cost = getCost(k);
                    int gold = countGold(i, j, k);

                    if(gold * m >= cost) {
                        ans = Math.max(ans, gold);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static int countGold(int x, int y, int k) {
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(Math.abs(x - i) + Math.abs(y - j) > k) {
                    continue;
                }

                cnt += arr[i][j];
            }
        }

        return cnt;
    }

    public static int getCost(int k) {
        return k * k + (k + 1) * (k + 1);
    }
}