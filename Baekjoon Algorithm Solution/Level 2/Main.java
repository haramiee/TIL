import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int hour, min;
        if (B >= 45) {
            min = B - 45;
            System.out.println(A + " " + min);
        } else if (B < 45) {
            min = 60 - (45 - B);
            if (A != 0) {
                hour = A - 1;
                System.out.println(hour + " " + min);
            } else if (A == 0) {
                int HOUR = 23;
                System.out.println(HOUR + " " + min);
            }
        }
    }
}
