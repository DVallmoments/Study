package Day0603;
import java.util.Scanner;

public class Chap19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temp;
		System.out.println("정수 a: ");
		int a = sc.nextInt();
		System.out.println("정수 b: ");
		int b = sc.nextInt();

		if (a >= b) {
			System.out.println("a>=b가 되도록 정렬했습니다.");
			System.out.println("변수 a는 " + a + "입니다.");
			System.out.println("변수 b는 " + b + "입니다.");
		} else {
			temp = a;
			a = b;
			b = temp;
			System.out.println("a>=b가 되도록 정렬했습니다.");
			System.out.println("변수 a는 " + a + "입니다.");
			System.out.println("변수 b는 " + b + "입니다.");
		}
	}
}
