package Day0620;

public class BPhone implements IFunction {
	String name;

	public BPhone() {
		this.name = "BPhone";
	}

	@Override
	public void Call() {
		System.out.println("전화 가능합니다.");
	}

	@Override
	public void Connect() {
		System.out.println("가능합니다. 5G입니다.");
	}

	@Override
	public void TVRemote() {
		System.out.println("탑재 되어 있습니다.");
	}
}
