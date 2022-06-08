import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 주어진 수 N, 새로운 수 T */
		int N = Integer.parseInt(br.readLine()); 	/* 처음 입력 값 */
		int copy = N; 								/* 입력 값 복사 */
		int count = 0;								/* 몇 번 반복됐는지 카운트 */
		
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if (copy == N) {
				break;
			}
		}
		
		System.out.println(count);
	}
}
