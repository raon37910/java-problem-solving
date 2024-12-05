public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7, temp = 0, temp2 = 0;
        temp = a;
        temp2 = b;
        a = c;
        b = temp;
        c = temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}