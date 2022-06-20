package Day0617;

public class Student1 extends LunchMenu {
	public Student1(int rice, int bulgogi, int banana) {
		super(rice, bulgogi, banana);
		this.name = "Student1";
	}

	@Override
	public int calculator() {
		return rice + bulgogi + banana;
	}
}
