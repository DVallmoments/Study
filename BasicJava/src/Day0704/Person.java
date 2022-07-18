package Day0704;

public class Person {
	private Roll r;

	public Roll getRole() {
		return r;
	}

	public void setRole(Roll r) {
		this.r = r;
	}

	public void behavior() {
		r.behavior();
	}
}
