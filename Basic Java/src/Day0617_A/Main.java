package Day0617_A;

public class Main {
	public static void main(String[] args) {
		Student1 std1 = new Student1();
		Student2 std2 = new Student2();

		System.out.println(std1.name + " 식비는 " + std1.calculator() + "원 입니다....");
		System.out.println(std2.name + " 식비는 " + std2.calculator() + "원 입니다....");
	}
}
