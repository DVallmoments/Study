package Day0608;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, r;

		System.out.print("숫자 두개 입력 :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);

		System.out.print("반지름 입력 : ");
		r = sc.nextInt();
		circleArea(r);
	}

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public static void div(int num1, int num2) {
		System.out.println((double) num1 / num2);
	}

	public static void circleArea(int r) {
		final double PI = 3.14;
		System.out.printf("%.1f\n", (2 * (PI * r)));
	}
}
