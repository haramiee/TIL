import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for (int i=1; i <= 9; i++) {
			int result = times * i;
			System.out.println(times + " * " + i + " = " + result);
		}
	}
}
