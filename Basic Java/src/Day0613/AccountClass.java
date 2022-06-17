package Day0613;

public class AccountClass {
	private String name;
	private int no;
	private int balance;
	private int withdraw;

	public AccountClass() {}

	public AccountClass(String name, int no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	public String getName() { return name; }
	public int getNo() { return no; }
	public int getBalance() {
		if (withdraw == 0)
			return balance;
		else
			return balance - withdraw;
	}
	
	public void setName(String name) { this.name = name; }
	public void setNo(int no) { this.no = no; }
	public void setBalance(int balance) { this.balance = balance; }
	public void setWithdraw(int k) { this.withdraw = k; }
	
	public String toString() {
		return "계좌 기본 정보:{" + name + "," + no + "," + balance + "}";
	}
}
