public class Gugudan {
	public static void main(String[] args) {
		/* 정수 9개를 저장할 수 있는 배열 생성 */
		int[] result = new int[9];
		for (int i=0; i < result.length; i++) {
			/* 배열은 0부터 시작하기 때문에 1을 더해 준다. 2X1부터 시작하니까! */
			result[i] = 2 * (i + 1);
			System.out.println(result[i]);
		}
		
		result = new int[9];
		for (int i=0; i < result.length; i++) {
			result[i] = 3 * (i + 1);
			System.out.println(result[i]);
		}
	}
}
