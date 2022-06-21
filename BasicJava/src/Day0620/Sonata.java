package Day0620;

public abstract class Sonata {
	int tax, displacement;
	String color, tire, handle;

	public Sonata(String color, String tire, int displacement, String handle) {
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}

	public abstract void getSpec();
}
