package Day0613;

import java.util.Scanner;

public class AccountClassMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountClass ac = new AccountClass();

		System.out.println("계좌 정보를 입력하세요");
		System.out.print("계좌명의: ");
		ac.setName(sc.nextLine());
		System.out.print("계좌번호: ");
		ac.setNo(sc.nextInt());
		System.out.print("잔고: ");
		ac.setBalance(sc.nextInt());

		System.out.println(ac.toString());
		System.out.print("출금액 :");
		ac.setWithdraw(sc.nextInt());

		System.out.println("잔금은 " + ac.getBalance() + "입니다.");
	}
}
