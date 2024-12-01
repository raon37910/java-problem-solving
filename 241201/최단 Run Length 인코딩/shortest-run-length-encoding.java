import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word = sc.next();
        int answer = Integer.MAX_VALUE;

        for(int i = 0; i < word.length(); i++) {
            answer = Math.min(encoding(word).length(), answer);
            word = word.charAt(word.length() - 1) + word.substring(0, word.length() - 1);
        }

        System.out.println(answer);
    }

    public static String encoding(String word) {
        String result = "";
        char c = word.charAt(0);

        result += c;
        int cnt = 1;

        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i) == word.charAt(i-1)) {
                cnt++;
            } else {
                result += cnt;
                result += word.charAt(i);
                cnt = 1;
            }
        }

        result += cnt;

        return result;
    }
}