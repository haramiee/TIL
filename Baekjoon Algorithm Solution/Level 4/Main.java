import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for (int val : arr) {
			if (val > max) {
				max = val;
			}
		}
		
		double[] ar = new double[N];
		
		double sum = 0;
		for (int i=0; i<N; i++) {
			ar[i] = (double)arr[i] / (double)max * 100;
			sum += ar[i];
		}
		
		System.out.println((double) sum / N);
	}
}
