package Day0610;

public class Member1 {
	String name;
	String phoneNumber;
	String major;
	int grade;
	String email;
	String birth;
	String address;

	public static void main(String[] args) {
		Member1 member1 = new Member1("SHKIM", "010-9999-7777", "컴퓨터", 2, "shkim@gmail.com", "2000-10-11", "서울");
		Member1 member2 = new Member1("JJKIM", "010-1111-3333", "컴퓨터", 2, "jjkim@gmail.com");

		print(member1);
		System.out.print("-----------------------------------\n");
		print(member2);
	}

	public Member1(String name, String phoneNumber, String major, int grade, String email) {
		this(name, phoneNumber, major, grade, email, "정보없음", "정보없음");
	}

	public Member1(String name, String phoneNumber, String major, int grade, String email, String birth,
			String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}

	public static void print(Member1 member) {
		System.out.printf("이름 : %s\n전화번호 : %s\n전공 : %s\n학년 : %d\n이메일 : %s\n생일 : %s\n주소 : %s\n", member.name,
				member.phoneNumber, member.major, member.grade, member.email, member.birth, member.address);
	}
}