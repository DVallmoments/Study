package SandBox;

public class CustomerContact extends Contact {
	private String clientName;
	private String itemName;
	private String customerPosition;

	public CustomerContact() {
	}

	public CustomerContact(String name, String phone, String email, String address, String birth, String group,
			String clientName, String itemName, String customerPosition) {
		super(name, phone, email, address, birth, group);
		this.clientName = clientName;
		this.itemName = itemName;
		this.customerPosition = customerPosition;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCustomerPosition() {
		return customerPosition;
	}

	public void setCustomerPosition(String customerPosition) {
		this.customerPosition = customerPosition;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("거래처이름 : %s\n품목이름 : %s\n직급 : %s\n", clientName, itemName, customerPosition);
		System.out.println("-------------------");
	}
}
