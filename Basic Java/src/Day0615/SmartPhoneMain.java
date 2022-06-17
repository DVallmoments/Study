package Day0615;

import java.util.Scanner;

public class SmartPhoneMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SmartPhone sp = new SmartPhone();

		String state;
		String searchName;

		System.out.println("# 데이터 두개를 입력합니다.");
		for (int i = 0; i < 2; i++) {
			sp.inputContactData();
		}

		while (true) {
			menu();
			state = sc.nextLine();
			switch (state) {
			case "1":
				sp.inputContactData();
				break;
			case "2":
				sp.printAllContact();
				break;
			case "3":
				System.out.printf("검색할 이름을 입력하세요 : ");
				searchName = sc.nextLine();
				sp.searchContact(searchName);
				break;
			case "4":
				System.out.printf("삭제할 이름을 입력하세요 : ");
				searchName = sc.nextLine();
				sp.deleteContact(searchName);
				break;
			case "5":
				System.out.printf("수정할 이름을 입력하세요 : ");
				searchName = sc.nextLine();
				sp.editflags = true;
				sp.searchContact(searchName);
				break;
			case "6":
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력되었습니다.");
				break;
			}
		}
	}

	static void menu() {
		System.out.println("Contact -------------------------");
		System.out.println(">> 1.연락처 등록");
		System.out.println(">> 2.모든 연락처 출력");
		System.out.println(">> 3.연락처 검색");
		System.out.println(">> 4.연락처 삭제");
		System.out.println(">> 5.연락처 수정");
		System.out.println(">> 6.종료");
	}
}
