package Day0624;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}
}
