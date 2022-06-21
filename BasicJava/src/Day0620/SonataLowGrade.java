package Day0620;

public class SonataLowGrade extends Sonata {
	public SonataLowGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		this.tax = 1000;
	}

	@Override
	public void getSpec() {
		System.out.println("*******************");
		System.out.printf("색상: %s\n타이어: %s\n배기량: %d\n핸들: %s\n세금: %d\n", color, tire, displacement, handle, tax);
		System.out.println("*******************");
	}
}
