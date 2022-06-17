package Day0608;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, r;
		System.out.print("숫자 두개 입력 :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		Calculator cal = new Calculator();
		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.mul(num1, num2);
		cal.div(num1, num2);
		
		System.out.println("반지름 입력 : ");
		r = sc.nextInt();
		cal.circleArea(r);
	}
}
