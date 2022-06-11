import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		int sum = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		String str = String.valueOf(sum);			/* 합을 문자열로 바꿈 */
		
		for (int i=0; i<str.length(); i++) {		/* 예를 들어 sum이 1703700이면 7번 돌면서 */
			arr[(str.charAt(i) - 48)]++;			/* 1번 : arr[1]++; -> 1번 자리 값 증가 */
													/* 2번 : arr[7]++; -> 7번 자리 값 증가 */
		}
		
		for (int val : arr) {
			System.out.println(val);				/* 하나씩 프린트 */
		}
		
	}
}
