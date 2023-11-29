package Deepening.Problem10988;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String reverse = "";
        int ans = 1;
        for(int i = s.length() - 1; i>= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println(ans);
        } else {
            ans = 0;
            System.out.println(ans);
        }
    }
}
