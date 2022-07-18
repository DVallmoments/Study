package Day0704;

public class Driver implements Roll {
	String name = "운전자";

	@Override
	public void behavior() {
		System.out.println(name + " 운전합니다.");
	}
}
