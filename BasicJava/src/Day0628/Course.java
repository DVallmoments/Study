package Day0628;

import java.util.Vector;

public class Course {
	private String name;
	private Vector<Transcript> transcripts = new Vector<>();

	public Course(String name) {
		this.name = name;
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	public String getName() {
		return name;
	}
}
