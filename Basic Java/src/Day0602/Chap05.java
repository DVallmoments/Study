package Day0602;
import java.util.Scanner;

public class Chap05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 : ");
		int number = sc.nextInt();
		System.out.println("마지막 자릿수를 제외한 값은 " + (number / 10) + "입니다");
		System.out.println("마지막 자릿수는 " + (number % 10) + "입니다");
	}

}
