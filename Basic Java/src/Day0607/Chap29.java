package Day0607;

public class Chap29 {
	public static void main(String[] args) {
//		int[] scores;
//		scores = new int[] { 83, 90, 87 };
//
//		int sum1 = 0;
//		for (int i = 0; i < 3; i++)
//			sum1 += scores[i];
//
//		System.out.println("총합:" + sum1);

		int sum1 = add(10, 20);
		text(sum1);

//		int sum2 = add1(new int[] { 55, 32, 44 });
//		System.out.println("총합:" + sum2);
	}

	public static void text(int sum1) {
		System.out.println(sum1);
	}

	public static int add(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	public static int add1(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++)
			sum += scores[i];

		return sum;
	}
}
