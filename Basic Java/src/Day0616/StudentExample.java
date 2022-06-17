package Day0616;

public class StudentExample {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", "12345", 1);

		System.out.println("name : " + student1.name);
		System.out.println("ssn : " + student1.ssn);
		System.out.println("studentNo : " + student1.studentNo);
	}
}
