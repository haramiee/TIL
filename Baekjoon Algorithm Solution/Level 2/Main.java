import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int HOUR = Integer.parseInt(st.nextToken());
		int MINUTE = Integer.parseInt(st.nextToken());
		int NEED = Integer.parseInt(br.readLine());
        
        /* 시간을 분으로 (★)치환해서 계산한 후 몫과 나머지로 시간과 분을 뽑아냄 */
        int all  = HOUR*60 + MINUTE + NEED;
        HOUR = all / 60;
        MINUTE = all % 60;
       
        if (HOUR >= 24) {
            HOUR -= 24;
        }
        
        System.out.println(HOUR + " " + MINUTE);
    }
}
