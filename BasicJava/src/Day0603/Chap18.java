package Day0603;
import java.util.Scanner;

public class Chap18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 a: ");
		int a = sc.nextInt();

		System.out.println("정수 b: ");
		int b = sc.nextInt();

		String result = a - b >= 10 ? "두값의 차이는 10이상입니다." : "두 값의 차이는 9이하입니다.";
		System.out.println(result);
	}
}