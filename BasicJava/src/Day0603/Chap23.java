package Day0603;
import java.util.Scanner;

public class Chap23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?");
		int star = sc.nextInt();

		if (star < 0)
			System.out.println("음수는 제공하지 않습니다.");
		else {
//			for (int i = 0; i < star; i++)
//				System.out.print("*");'
			int i = 0;
			while (i < star) {
				System.out.print("*");
				i++;
			}
		}
	}
}
