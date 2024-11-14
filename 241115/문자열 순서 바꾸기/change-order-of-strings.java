import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        String t = sc.next();
        
        String temp = t;
        t = s;
        s = temp;

        System.out.println(s);
        System.out.println(t);
    }
}