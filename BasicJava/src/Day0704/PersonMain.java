package Day0704;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();

		p.setRole(new Worker());
		p.behavior();

		p.setRole(new Driver());
		p.behavior();
	}
}
