package Day0615;

import java.util.Scanner;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Contact[] ct = new Contact[10];

	int inputDataLength = 0;
	String name, phone, email, address, birth, group;
	boolean editflags = false;

	public Contact inputContactData() {
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("전화번호: ");
		phone = sc.nextLine();
		System.out.print("이메일: ");
		email = sc.nextLine();
		System.out.print("주소: ");
		address = sc.nextLine();
		System.out.print("생일: ");
		birth = sc.nextLine();
		System.out.print("그룹: ");
		group = sc.nextLine();

		return addContact(new Contact(name, phone, email, address, birth, group));
	}

	public Contact addContact(Contact contact) {
		ct[inputDataLength] = contact;

		if (editflags == false)
			inputDataLength++;
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
			if (ct[i].getName().contentEquals(name) == true) {
				if (editflags == true) {
					printContact(ct[i]);
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
		newContact = inputContactData();
		editflags = false;
	}
}