package Day0617_B;

public class Student2 extends LunchMenu {
	int rice, bulgogi, milk, almond;

	public Student2() {
		super();
		this.name = "Student2";
	}

	@Override
	public int calculator() {
		return price.bulgogi + price.rice + price.milk + price.almond;
	}
	
	@Override
	public void print() {
		System.out.println(name + " 식비는 " + calculator() + "원 입니다....");
	}
}
