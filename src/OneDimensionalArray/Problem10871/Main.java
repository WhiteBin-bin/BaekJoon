package OneDimensionalArray.Problem10871;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for(int j = 0; j < A.length; j++) {
            if(A[j] < X ) {
                System.out.printf("%d ", A[j]);
            }
        }
    }
}
