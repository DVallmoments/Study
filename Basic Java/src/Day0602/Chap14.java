package Day0602;

public class Chap14 {

	public static void main(String[] args) {
		// 1부터 100까지 홀수만 더하는 프로그램을 짜세요
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.println(sum);
	}
}
