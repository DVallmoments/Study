package Day0617;

public abstract class LunchMenu {
	Price price = new Price();
	
	String name;
	int rice, bulgogi, banana, milk, almond;

	public LunchMenu() {
		this.rice = price.rice;
		this.bulgogi = price.bulgogi;
		this.banana = price.banana;
		this.milk = price.milk;
		this.almond = price.almond;
	}

	public abstract int calculator();
	public abstract void print();
}
