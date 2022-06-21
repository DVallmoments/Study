package Day0617;

public class Student2 extends LunchMenu {
	public Student2(int rice, int bulgogi, int milk, int almond) {
		super(rice, bulgogi, milk, almond);
		this.name = "Student2";
	}

	@Override
	public int calculator() {
		return rice + bulgogi + milk + almond;
	}
}
