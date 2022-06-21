package SandBox;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Contact[] ct = new Contact[10];

	int inputDataLength = 0;
	int editPosition;
	String name, phone, email, address, birth, group;
	String companyName, departmentName, companyPosition;
	String clientName, itemName, customerPosition;
	boolean editflags = false;
	String company = "회사";
	String client = "거래처";
//	String company = "a";
//	String client = "b";

	public Contact companyInputContactData() {
		System.out.print("회사이름: ");
		companyName = sc.nextLine();
		System.out.print("부서이름: ");
		departmentName = sc.nextLine();
		System.out.print("직급: ");
		companyPosition = sc.nextLine();
		return addContact(new CompanyContact(name, phone, email, address, birth, group, companyName, departmentName,
				companyPosition));
	}

	public Contact customerInputContactData() {
		System.out.print("거래처이름: ");
		clientName = sc.nextLine();
		System.out.print("품목이름: ");
		itemName = sc.nextLine();
		System.out.print("직급: ");
		customerPosition = sc.nextLine();
		return addContact(
				new CustomerContact(name, phone, email, address, birth, group, clientName, itemName, customerPosition));
	}

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
		if (group.contentEquals(company)) {
			System.out.print("회사이름: ");
			companyName = sc.nextLine();
			System.out.print("부서이름: ");
			departmentName = sc.nextLine();
			System.out.print("직급: ");
			companyPosition = sc.nextLine();
			return addContact(new CompanyContact(name, phone, email, address, birth, group, companyName, departmentName,
					companyPosition));

		} else if (group.contentEquals(client)) {
			System.out.print("거래처이름: ");
			clientName = sc.nextLine();
			System.out.print("품목이름: ");
			itemName = sc.nextLine();
			System.out.print("직급: ");
			customerPosition = sc.nextLine();
			return addContact(new CustomerContact(name, phone, email, address, birth, group, clientName, itemName,
					customerPosition));

		} else {
			return addContact(new Contact(name, phone, email, address, birth, group));
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
		newContact = inputContactData();
		editflags = false;
	}
}