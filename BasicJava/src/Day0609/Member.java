package Day0609;

public class Member {
	public static void main(String[] args) {
		String name = "송강주";
		int age = 27;
		double height = 174.3;
		boolean hasBook = false;

		String ownBook;
		if (hasBook)
			ownBook = "보유하고 있습니다.";
		else
			ownBook = "보유하지 않았습니다.";

		System.out.println("이름은 :" + name);
		System.out.println("나이는 :" + age);
		System.out.println("키는 :" + height);
		System.out.println("책은 :" + ownBook);
	}
}
