package Day0608;

public class Chap34 {
	public static void main(String[] args) {
		int[] scores = { 95, 91, 84, 93, 87 };

		int sum = 0;
		for (int score : scores)
			sum = sum + score;

		System.out.println("점수 총합 =" + sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 =" + avg);
	}
}
