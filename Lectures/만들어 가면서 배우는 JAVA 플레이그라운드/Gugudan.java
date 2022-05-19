import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] splited = str.split(",");
		int num1 = Integer.parseInt(splited[0]);
		int num2 = Integer.parseInt(splited[1]);
		for (int i=2; i <= num1; i++) {
			System.out.println("######" + i + " 단!!");
			for (int j=1; j <= num2; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
