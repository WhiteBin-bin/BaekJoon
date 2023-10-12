package RepeatedSentence.Problem8393;
import java.util.Scanner;

class Main {
    public static void main(String[] args) { //1부터 입력 받은 값만큼 더해줌.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        System.out.println(ans);
    }
}