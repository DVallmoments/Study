package Day0617;

public class Main {
	public static void main(String[] args) {

		LunchMenu lm = null;

		lm = new Student1(Price.RICE, Price.BULGOGI, Price.BANANA);
		lm.showInfo();

		lm = new Student2(Price.RICE, Price.BULGOGI, Price.MILK, Price.ALMOND);
		lm.showInfo();
	}
}
