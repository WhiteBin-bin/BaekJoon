package RepeatedSentence.Problem15552;
import java.io.BufferedReader; //Buffer reader 사용하는데 필요함.
import java.io.BufferedWriter; //Buffer Writer 사용하는데 필요함.
import java.io.IOException; // 예외 처리를 꼭 해주어야 하며 예외처리를 해주기 위해서 사용해야하는 IOException.
import java.io.InputStreamReader; //Buffer reader 사용하는데 필요함.
import java.io.OutputStreamWriter; //Buffer Writer 사용하는데 필요함.
import java.util.StringTokenizer; //한 개의 문자열을 여러 개의 토큰으로 분리하는 클래스.

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
        }
        br.close();

        bw.flush();
        bw.close();

    }
}
