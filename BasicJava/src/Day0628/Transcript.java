package Day0628;

public class Transcript {
	private String date, grade;
	private Course course;
	private Student student;

	public Transcript(Student student, Course course, String date, String grade) {
		this.student = student;
		this.course = course;
		this.date = date;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
