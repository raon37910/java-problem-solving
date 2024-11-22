import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true)    {
            int width = sc.nextInt();
            int height = sc.nextInt();
            int c = sc.next().charAt(0);

            System.out.println(width * height);

            if(c == 'C') {
                break;
            }
        }
    }
}