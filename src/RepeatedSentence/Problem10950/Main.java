package RepeatedSentence.Problem10950;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { //테스트 케이스 개수를 만큼 그 수만큼 반복하며 입력 받은 두 수를 더해줌.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d\n", (a + b));
        }
    }
}
