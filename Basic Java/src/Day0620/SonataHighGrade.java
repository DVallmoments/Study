package Day0620;

public class SonataHighGrade extends Sonata {
	public SonataHighGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		this.tax = 1500;
	}

	@Override
	public void getSpec() {
		System.out.println("*******************");
		System.out.printf("색상: %s\n타이어: %s\n배기량: %d\n핸들: %s\n세금: %d\n", color, tire, displacement, handle, tax);
		System.out.println("*******************");
	}
}
