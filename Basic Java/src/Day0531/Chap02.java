package Day0531;

public class Chap02 {
	public static void main(String[] args) {
		double r = 5.0;
		final double PI = 3.141592;
		double result = 0.0;

		result = r * r * PI;
		System.out.println("반지름이 " + (int) r + "인 원의 면적은 " + result);
	}
}