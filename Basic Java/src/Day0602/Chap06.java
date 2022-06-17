package Day0602;
import java.util.Scanner;

public class Chap06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x 값 : ");
		double x = sc.nextDouble();
		System.out.println("y 값 : ");
		double y = sc.nextDouble();
		System.out.println("합계는 " + ((double)x+y) + "입니다.");
		System.out.println("평균은 " + (((double)x+y)/2.0) + "입니다.");
	}

}
