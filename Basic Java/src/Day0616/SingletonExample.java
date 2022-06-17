package Day0616;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2)
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체 ");

		obj1.say("A가", "프린터 사용중");
		obj2.say("B가", "프린터 사용중");
	}
}
