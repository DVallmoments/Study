package Day0603;
import java.util.Scanner;

public class Chap17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수값 : ");
		int number = sc.nextInt();

		if (number > 0) {
			if (number % 3 == 0)
				System.out.println("이 값은 3으로 나누어집니다.");
			else {
				if (number % 3 == 1)
					System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
				else
					System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			}
		} else
			System.out.println("이 값은 양수가 아닌 값을 입력했네요");
	}
}