package Day0603;
import java.util.Random;

public class Chap20 {
	public static void main(String[] args) {
		Random rand = new Random();

		int test = rand.nextInt(3);
		String result = "";

		switch (test) {
		case 0:
			result = "가위";
			break;
		case 1:
			result = "바위";
			break;
		default:
			result = "보";
			break;
		}
		System.out.println("컴퓨터가 낸것은\n" + result);

	}

}
