package RepeatedSentence.Problem2739;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= 9; i++) { //구구단 곱셈 숫자를 계속 해서 늘려줌.
            System.out.printf("2 * %d = %d\n", b, (a * i));
            b++;
        }
    }
}
