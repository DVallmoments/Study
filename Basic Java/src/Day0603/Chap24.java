package Day0603;
import java.util.Scanner;

public class Chap24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수값: ");
		int x = sc.nextInt();

		int factorial = 1;

		for (int i = 1; i <= x; i++) {
			factorial *= i;
		}
		System.out.println("1부터 " + x + "까지의 곱은 " + factorial + "입니다.");
	}
}
