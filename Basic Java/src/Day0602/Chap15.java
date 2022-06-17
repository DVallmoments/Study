package Day0602;
import java.util.Scanner;

public class Chap15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수값 : ");
		int number = sc.nextInt();

		if (number < 0)
			System.out.println("절대값은 : " + (-(number)) + "입니다.");
		else
			System.out.println("절대값은 : " + number + "입니다.");
	}
}
