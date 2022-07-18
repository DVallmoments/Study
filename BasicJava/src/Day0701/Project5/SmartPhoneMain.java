package Day0701.Project5;

public class SmartPhoneMain {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();

		while (true) {
			menu();
			switch (sp.sc.nextLine()) {
			case "1":
				sp.inputContactData();
				break;
			case "2":
				System.out.printf("검색할 이름을 입력하세요 : ");
				sp.searchContact(sp.sc.nextLine());
				break;
			case "3":
				System.out.printf("수정할 이름을 입력하세요 : ");
				sp.editflags = true;
				sp.searchContact(sp.sc.nextLine());
				break;
			case "4":
				System.out.printf("삭제할 이름을 입력하세요 : ");
				sp.deleteContact(sp.sc.nextLine());
				break;
			case "5":
				sp.printAllContact();
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
		System.out.println("===========================");
		System.out.println("1. 연락처 입력");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전체 리스트 보기");
		System.out.println("6. 종료");
		System.out.println("===========================");
	}
}
