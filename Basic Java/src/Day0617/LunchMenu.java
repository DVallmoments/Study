package Day0617;

public abstract class LunchMenu {
	String name;
	int rice, bulgogi, banana, milk, almond;

	public LunchMenu(int rice, int bulgogi) {
		this.rice = Price.RICE;
		this.bulgogi = Price.BULGOGI;
	}

	public LunchMenu(int rice, int bulgogi, int banana) {
		this(rice, bulgogi);
		this.banana = Price.BANANA;
	}

	public LunchMenu(int rice, int bulgogi, int milk, int almond) {
		this(rice, bulgogi);
		this.milk = Price.MILK;
		this.almond = Price.ALMOND;
	}

	public void showInfo() {
		System.out.println(name + " 식비는 " + calculator() + "원 입니다....");
	}

	public abstract int calculator();
}
