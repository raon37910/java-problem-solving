import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int[][] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];

        input();

        int ans = Integer.MIN_VALUE;

        for(int x1 = 0; x1 < n; x1++) {
            for(int y1 = 0; y1 < n; y1++) {
                for(int x2 = x1; x2 < n; x2++) {
                    for(int y2 = y1; y2 < n; y2++) {
                        ans = Math.max(selectNext(x1, y1, x2, y2), ans);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static int selectNext(int x1, int y1, int x2, int y2) {
            int max = Integer.MIN_VALUE;

            for(int x3 = 0; x3 < n; x3++) {
                for(int y3 = 0; y3 < n; y3++) {
                    for(int x4 = x3; x4 < n; x4++) {
                        for(int y4 = y3; y4 < n; y4++) {
                            // 사각형이 겹치지 않는다면
                            if(check(x1, y1, x2 , y2, x3, y3, x4, y4)) {
                                int temp = sumSquare(x1, y1, x2, y2);
                                temp += sumSquare(x3, y3, x4, y4);
                                max = Math.max(max, temp);
                            }
                        }
                    }
                }
            }

            return max;
        }

        public static int sumSquare(int x1, int y1, int x2, int y2) {
            int ans = 0;
            
            for(int i = x1; i <= x2; i++) {
                for(int j = y1; j <= y2; j++) {
                    ans += arr[i][j];
                }
            }

            return ans;
        }

        public static boolean check(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
            boolean[][] visited = new boolean[n][m];

            for(int i = x1; i <= x2; i++) {
                for(int j = y1; j <= y2; j++) {
                    if(visited[i][j]) {
                        return false;
                    }

                    visited[i][j] = true;
                }
            }

            for(int i = x3; i <= x4; i++) {
                for(int j = y3; j <= y4; j++) {
                    if(visited[i][j]) {
                        return false;
                    }

                    visited[i][j] = true;
                }
            }

            return true;
        }

    public static void input() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}