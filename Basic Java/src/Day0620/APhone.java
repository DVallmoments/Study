package Day0620;

public class APhone implements IFunction {
	String name;

	public APhone() {
		this.name = "APhone";
	}

	@Override
	public void Call() {
		System.out.println("전화 가능합니다.");
	}

	@Override
	public void Connect() {
		System.out.println("불가능합니다. 3G입니다.");
	}

	@Override
	public void TVRemote() {
		System.out.println("미 탑재 되어 있습니다.");
	}
}
