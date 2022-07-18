package Day0701.Project5;

import java.util.Scanner;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Contact[] ct = new Contact[10];
	String[] menuData = { "이름: ", "전화번호: ", "이메일: ", "주소: ", "생일: ", "그룹: ", "회사이름: ", "부서이름: ", "직급: ", "거래처이름: ",
			"품목이름: ", "직급: " };
	int menuCount = 0;
	int inputDataLength = 0;
	int editPosition;
	boolean editflags, addflags = false;

	public void duplicatePhone(String phone) {
		for (int i = 0; i < inputDataLength; i++) {
			if (phone.contains(ct[i].getPhone())) {
				System.out.println("전화번호 중복, 다시입력해주세요");
				inputContactData();
			}
		}
	}

	public String insertData() {
		String text;
		do {
			System.out.print(menuData[menuCount]);
			text = sc.nextLine();
		} while (text.trim().isEmpty());
		menuCount++;
		return text;
	}

	public Contact inputContactData() {
		String name = insertData();
		String phone = insertData();
		duplicatePhone(phone);
		String email = insertData();
		String address = insertData();
		String birth = insertData();
		String group = insertData();
		switch (group) {
		case "a":
			String companyName = insertData();
			String departmentName = insertData();
			String companyPosition = insertData();
			menuCount = 0;
			return addContact(new CompanyContact(name, phone, email, address, birth, group, companyName, departmentName,
					companyPosition));

		case "b":
			menuCount += 3;
			String clientName = insertData();
			String itemName = insertData();
			String customerPosition = insertData();
			menuCount = 0;
			return addContact(new CustomerContact(name, phone, email, address, birth, group, clientName, itemName,
					customerPosition));
		default:
			System.out.println("잘못된 그룹 입력입니다. 다시 입력해주세요");
			return null;
		}
	}

	public Contact addContact(Contact contact) {
		if (editflags == false) {
			ct[inputDataLength] = contact;
			inputDataLength++;
		} else {
			ct[editPosition] = contact;
		}
		System.out.printf(">>> 데이터가 저장되었습니다. (%d)\n", inputDataLength);
		return contact;
	}

	public void printContact(Contact contact) {
		contact.printInfo();
	}

	public void printAllContact() {
		for (int i = 0; i < inputDataLength; i++) {
			printContact(ct[i]);
		}
	}

	public void searchContact(String name) {
		for (int i = 0; i < inputDataLength; i++) {
			if (ct[i].getName().contentEquals(name)) {
				if (editflags) {
					printContact(ct[i]);
					editPosition = i;
					editContact(name, ct[i]);
				} else {
					printContact(ct[i]);
				}
			}
		}
	}

	public void deleteContact(String name) {
		for (int i = 0; i < inputDataLength; i++) {
			if (ct[i].getName().contentEquals(name)) {
				for (int j = i; j < inputDataLength - 1; j++) {
					ct[j] = ct[j + 1];
				}
				inputDataLength--;
			}
		}
	}

	public void editContact(String name, Contact newContact) {
		System.out.println(name + " 수정합니다.");
		newContact = inputContactData();
		editflags = false;
	}
}