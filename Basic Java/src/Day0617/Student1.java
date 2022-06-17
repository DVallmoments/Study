package Day0617;

public class Student1 extends LunchMenu {
	int rice, bulgogi, banana;

	public Student1() {
		super();
		this.name = "Student1";
	}

	@Override
	public int calculator() {
		return price.bulgogi + price.rice + price.banana;
	}

	@Override
	public void print() {
		System.out.println(name + " 식비는 " + calculator() + "원 입니다....");
	}
}
