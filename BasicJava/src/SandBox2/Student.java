package SandBox2;

import java.util.Vector;

public class Student {
	private String name;
	private Vector<Course> courses = new Vector<>();

	public Student(String name) {
		this.name = name;
	}

	public void registerCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) { // courses에 course로 들어온게 포함되었는지 확인
			courses.remove(course);
			course.removeStudent(this);
		}
	}

	public Vector<Course> getCourse() {
		return courses;
	}

	public String getName() {
		return name;
	}
}
