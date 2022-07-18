package Day0629;

public abstract class HomeAppliances {
	private int serialNo;
	private String nanufacturer;
	private int year;

	public HomeAppliances(int serialNo, String nanufacturer, int year) {
		this.serialNo = serialNo;
		this.nanufacturer = nanufacturer;
		this.year = year;
	}

	public abstract void turnOn();

	public abstract void turnOff();
}
