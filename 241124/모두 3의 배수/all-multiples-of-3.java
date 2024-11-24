import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean result = true;
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            if(arr[i] % 3 != 0) {
                result = false;
                break;
            }
        }

        System.out.println(result ? "1" : "0");
    }
}