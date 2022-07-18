package Day0704;

public class Worker implements Roll {
	String name = "회사원";
	
	@Override
	public void behavior() {
		System.out.println(name + " 일합니다.");
	}
}
