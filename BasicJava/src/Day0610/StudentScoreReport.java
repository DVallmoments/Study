package Day0610;

public class StudentScoreReport {
	public static void main(String[] args) {
		Student[] std = new Student[10];

		std[0] = new Student(100, 70, 80, "희철");
		std[1] = new Student(70, 80, 60, "은혁");
		std[2] = new Student(80, 70, 70, "성민");
		std[3] = new Student(60, 80, 80, "시원");
		std[4] = new Student(50, 60, 70, "규현");
		std[5] = new Student(70, 50, 60, "려욱");
		std[6] = new Student(90, 90, 50, "신동");
		std[7] = new Student(90, 80, 90, "이특");
		std[8] = new Student(80, 70, 90, "동해");
		std[9] = new Student(100, 80, 90, "예성");

		System.out.println("### Score Report ###");
		System.out.println("국어 \t영어 \t수학\t|\t총합\t평균\t이름");
		System.out.println("---------------------------------------------------");

		for (int i = 0; i < std.length; i++) {
			System.out.printf("%d\t%d\t%d\t|\t%d\t%d\t%s", std[i].getKor(), std[i].getEng(), std[i].getMath(),
					std[i].getSum(), std[i].getAvg(), std[i].getName());
			System.out.println();
		}
	}
}
