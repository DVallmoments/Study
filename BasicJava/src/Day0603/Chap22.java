package Day0603;
import java.util.Scanner;

public class Chap22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 A: ");
		int a = sc.nextInt();
		System.out.println("정수 B: ");
		int b = sc.nextInt();

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int i = b;

		do {
			System.out.println(i++);
		} while (i <= a);
	}

}
