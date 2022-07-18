package SandBox2;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		s1.registerCourse(new Course("수학"));

		Course c1 = new Course("수학");
		c1.addStudent(new Student("홍길동"));

	}
}
