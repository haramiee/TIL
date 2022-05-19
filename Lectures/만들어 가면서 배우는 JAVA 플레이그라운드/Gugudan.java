import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 2) {
			System.out.println("값을 잘못 입력하셨습니다.");
		} else if (number > 9) {
			System.out.println("값을 잘못 입력하셨습니다.");
		} else {
			for (int i=1; i<10; i++) {
				System.out.println(number * i);
			}
		}
	}
}
