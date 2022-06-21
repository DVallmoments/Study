package Day0610;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = 0;
		System.out.print("태어난 년도를 입력하세요 : ");
		year = sc.nextInt();
		vaccine(year);

		System.out.println();
		System.out.print("태어난 년도를 입력하세요 : ");
		year = sc.nextInt();
		checkUp(year);
	}

	public static void vaccine(int year) {
		int age = (2022 - year) + 1;

		if (13 > age && age <= 60)
			System.out.println("무료 예방접종이 가능합니다.");
		else
			System.out.println("무료 접종 대상이 아닙니다.");
	}

	public static void checkUp(int year) {
		int age = (2022 - year) + 1;

		if (year % 2 == 0) {
			System.out.println("올해 검사 대상 입니다.");
			if (age >= 40)
				System.out.println("무료로 암 검사가 가능합니다.");
		} else
			System.out.println("올해 검사 대상이 아닙니다.");
	}
}