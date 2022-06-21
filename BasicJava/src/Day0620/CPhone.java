package Day0620;

public class CPhone implements IFunction {
	String name;

	public CPhone() {
		this.name = "CPhone";
	}

	@Override
	public void Call() {
		System.out.println("전화 가능합니다.");
	}

	@Override
	public void Connect() {
		System.out.println("가능합니다. 4G입니다.");
	}

	@Override
	public void TVRemote() {
		System.out.println("미 탑재 되어 있습니다.");
	}
}
