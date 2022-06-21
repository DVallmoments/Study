package Day0607;

import java.util.Scanner;

public class Chap31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사람 수는 몇명:");
		int people = sc.nextInt();

		int[] array = new int[people];

		int result = 0;
		double avg = 0;

		System.out.println("점수를 입력하세요:");
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번의 점수: ");
			array[i] = sc.nextInt();
			result += array[i];
		}

		int lowScore = array[0], highScore = array[0];
		for (int i = 0; i < array.length; i++) {
			if (highScore < array[i])
				highScore = array[i];

			else if (lowScore > array[i])
				lowScore = array[i];
		}

		avg = (double) result / array.length;

		System.out.println("합계는 " + result + "점입니다.");
		System.out.println("평균은 " + avg + "점입니다.");
		System.out.println("최고점은 " + highScore + "점입니다.");
		System.out.println("최저점은 " + lowScore + "점입니다.");
	}
}
