package Day0614;

import java.util.Scanner;

public class ContactMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact ct = new Contact("최윤호", "010-0000-0000", "choi@gmail.com", "서울", "2000-05-05", "친구");

		ct.printInfo();
		System.out.println("---------------------------");
		System.out.println("그룹 정보 변경");
		ct.setGroup("가족");
		System.out.println("---------------------------");
		ct.printInfo();
	}
}
