import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[][] arr;
    static int n;
    static int m;

    // 행복한 수열은 m개 이상의 동일한 원소가 나오는 순간이 존재하는 수열
    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(searchRow(i)) {
                cnt++;
            }

            if(searchCol(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean searchRow(int row) {
        int ans = 0;
        int temp = 1;

        for(int i = 1; i < n; i++) {
            // 연속해서 같은 수열이 나온 경우
            if(arr[row][i-1] == arr[row][i]) {
                temp++;
                continue;
            }
            // 다른 수열이 나오면 최대 값이랑 비교해서 업데이트
            ans = Math.max(ans, temp);
            temp = 1;
        }

        // 마지막 까지 연속인 경우
        ans = Math.max(temp, ans);
        return ans >= m;
    }

    public static boolean searchCol(int col) {
        int ans = 0;
        int temp = 1;

        for(int i = 1; i < n; i++) {
            // 연속해서 같은 수열이 나온 경우
            if(arr[i-1][col] == arr[i][col]) {
                temp++;
                continue;
            }
            // 다른 수열이 나오면 최대 값이랑 비교해서 업데이트
            ans = Math.max(ans, temp);
            temp = 1;
        }

        // 마지막 까지 연속인 경우
        ans = Math.max(temp, ans);
        return ans >= m;
    }
}