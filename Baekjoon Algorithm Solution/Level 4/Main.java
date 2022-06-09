import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int idx = 0;
		int[] ar = new int[N];
		while (st.hasMoreTokens()) {
			ar[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		Arrays.sort(ar);
		System.out.println(ar[0] + " " + ar[N-1]);
	}
}
