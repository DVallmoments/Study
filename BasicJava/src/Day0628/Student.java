package Day0628;

import java.util.Vector;

public class Student {
	private String name;
	private Course course;
	private Vector<Transcript> transcripts = new Vector<>();

	public Student(String name) {
		this.name = name;
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	public Course getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}
}