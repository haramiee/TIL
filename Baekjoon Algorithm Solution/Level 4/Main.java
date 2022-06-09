import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ar = new int[9];
		for (int i = 0; i < 9; i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int idx = 0;
		int cnt = 0;
		
		for (int val : ar) {
			cnt++;
			if (val > max) {
				max = value;
				idx = cnt;
			}
		}
		
		System.out.println(max);
		System.out.println(idx);
	}
}
