package Day0617_A;

public class Student1 extends LunchMenu {
	public Student1() {
		this.name = "Student1";
	}

	@Override
	public int calculator() {
		return Price.RICE + Price.BULGOGI + Price.MILK + Price.ALMOND;
	}
}
