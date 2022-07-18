package Day0628;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길서");
		Student s3 = new Student("홍길남");

		Course se = new Course("Software Engineering");
		Course dp = new Course("Desigin Pattern");

		Transcript t1 = new Transcript(s1, se, "2022-06-30", "A+");
		Transcript t2 = new Transcript(s2, dp,"2022-06-30", "C+");
		Transcript t3 = new Transcript(s3, dp,"2022-06-30", "A+");

		System.out.println(t1.getDate() + " " + t1.getStudent().getName() + " " + t1.getCourse().getName() + " " + t1.getGrade());
		System.out.println(t2.getDate() + " " + t2.getStudent().getName() + " " + t2.getCourse().getName() + " " + t2.getGrade());
		System.out.println(t3.getDate() + " " + t3.getStudent().getName() + " " + t3.getCourse().getName() + " " + t3.getGrade());
	}
}
