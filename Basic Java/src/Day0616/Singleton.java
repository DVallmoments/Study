package Day0616;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}

	public void say(String text1, String text2) {
		System.out.printf("%s %s\n", text1, text2);
	}
}
