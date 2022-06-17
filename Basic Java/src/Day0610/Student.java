package Day0610;

public class Student {
	private int kor;
	private int eng;
	private int math;
	private String name;
	private int sum;
	private int avg;

	public Student(int kor, int eng, int math, String name) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		this.sum = kor + eng + math;
		this.avg = sum / 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public int setSum(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		int result = kor + eng + math;
		return result;
	}

	public int getAvg() {
		return avg;
	}

	public int setAvg(int sum) {
		this.sum = sum;
		return sum / 3;
	}
}
