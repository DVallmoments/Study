package Day0617_A;

public class Student2 extends LunchMenu {
	public Student2() {
		this.name = "Student2";
	}

	@Override
	public int calculator() {
		return Price.RICE + Price.BULGOGI + Price.BANANA;
	}
}
