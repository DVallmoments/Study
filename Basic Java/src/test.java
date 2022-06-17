import java.util.Scanner;

public class test {
	Scanner sc = new Scanner(System.in);
	Contact[] con = new Contact[10];

	String name;

	int count = 0;

	public void inputContactData() {
		System.out.print("검색할 이름을 입력하세요 : ");
		name = sc.nextLine();

		Contact contact = new Contact(name);
		addContact(contact);
	}

	public void addContact(Contact contact) {
		con[count] = new Contact();
		con[count].setName(contact.getName());

		System.out.println(">>> 저장되었습니다 .(" + count + ")");
	}
}

//검색 > 수정