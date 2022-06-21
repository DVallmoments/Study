package Day0603;
import java.util.Scanner;

public class Chap26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2 이상의 정수값: ");
		int number = sc.nextInt();

		if (number % 2 != 0 && number % number == 0) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}
}
