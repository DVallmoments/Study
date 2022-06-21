package Day0602;
import java.util.Scanner;

public class Chap04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 : ");
		int number = sc.nextInt();
		System.out.println("100을 더한 값은 " + (100 + number) + "입니다.");
		System.out.println("100을 뺀 값은 " + -(100 - number) + "입니다.");
	}

}
