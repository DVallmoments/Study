package Day0603;
import java.util.Scanner;

public class Chap16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("변수 A : ");
		int a = sc.nextInt();
		System.out.println("변수 B : ");
		int b = sc.nextInt();

		if (a % b == 0) {
			System.out.println(b + "(은)는 " + a + "의 약수입니다.");
		} else
			System.out.println(b + "(은)는 " + a + "의 약수가 아닙니다.");
	}

}
