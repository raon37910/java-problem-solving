import java.util.Scanner;
import java.util.Arrays;

// N개의 폭탄이 쌓여 있다.
// M개 이상 연속으로 같은 숫자가 적혀있는 폭탄은 터진다.
// M개 이상인 폭탄들의 쌍이 여러개라면 동시에 터진다.
// M개 이상 연속한 숫자를 가지는 폭탄이 존재하지 않을 때 까지 반복했을 대 최종 결과를 출력하시오.
public class Main {

    static final int BLANK = 0;
    static int n;
    static int m;
    static int[] arr;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        input();
        // n = 5;
        // m = 2;
        // arr = new int[]{1,2,2,1,1};

        while(checkBombCondition()) {
            boolean[] positions = findRemovePositions();
            // System.out.println(Arrays.toString(positions));
            bomb(positions);
            shift();
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != BLANK) {
                cnt++;
            }
        }

        System.out.println(cnt);

        for(int i = 0; i < n; i++) {
            if(arr[i] != BLANK) {
                System.out.println(arr[i]);
            }
        }
    }

    // 입력 받기
    public static void input() {
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // 폭탄이 터지고 난 자리를 옮겨준다.
    public static void shift() {
        int[] tempArr = new int[n];
        int tempIndex = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != BLANK) {
                tempArr[tempIndex] = arr[i];
                tempIndex++;
            }
        }

        arr = tempArr;
    }

    // 폭탄을 터트린다.
    public static void bomb(boolean[] positions) {
        for(int i = 0; i < n; i++) {
            if(positions[i]) {
                arr[i] = BLANK;
            }
        }
    }

    // 폭탄이 터질 자리를 체크한다.
    public static boolean[] findRemovePositions() {
        boolean[] positions = new boolean[n];

        int startIndex = 0;
        int cnt = 1;

        for(int i = 1; i < n; i++) {
            if(arr[i] == BLANK) {
                continue;
            }

            if(arr[i-1] == arr[i]) {
                cnt++;
            } else {
                if(cnt >= m) {
                    // startIndex에서 i-1까지 폭탄이 터질 자리로 마킹을한다.
                    for(int j = startIndex; j < i; j++) {
                        positions[j] = true;
                    }
                } 

                cnt = 1;
                startIndex = i;
            }
        }

        // 마지막 폭탄이 연속적으로 진행 중이었을 경우 체크
        if(cnt >= m) {
            for(int i = startIndex; i < n; i++) {
                positions[i] = true;
            }
        }

        return positions;
    }

    // M개 이상 연속으로 나와 있는 폭탄이 있는지 확인한다.
    public static boolean checkBombCondition() {
        int cnt = 1;
        int maxCnt = 1;

        for(int i = 1; i < n; i++) {
            if(arr[i] == BLANK) {
                continue;
            }

            if(arr[i-1] == arr[i]) {
                cnt++;
            } else {
                maxCnt = Math.max(maxCnt, cnt);
                cnt = 1;
            }
        }

        return maxCnt >= m;
    }
}