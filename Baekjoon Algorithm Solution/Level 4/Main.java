import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 정수 % 42의 최댓값은 41이므로, 42 길이 boolean 배열을 생성한다. */
		boolean[] arr = new boolean[42];
		
		/* 정수 % 42를 인덱스로, 그 값을 true로 바꿔 준다. */
		/* 예를 들어 나머지가 1이면 arr[1] 값이 true로 바뀐다. -> true가 몇 개인지 세어 주면 된다. */
		for (int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		/* true 값을 담을 cnt를 생성하고 값이 true일 때마다 증가시킨다. */
		int cnt = 0;
		for (boolean val : arr) {
			if (val == true) cnt++;
		}
		
		System.out.println(cnt);
	}
}
