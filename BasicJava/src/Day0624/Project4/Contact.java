package Day0624.Project4;

public class Contact implements ShowData {
	private String name;
	private String phone;
	private String email;
	private String address;
	private String birth;
	private String group;

	public Contact(String name, String phone, String email, String address, String birth, String group) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getBirth() {
		return birth;
	}

	public String getGroup() {
		return group;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void printInfo() {
		showData();
		System.out.printf("이메일 : %s\n주소 : %s\n생일 : %s\n그룹 : %s\n", name, phone, email, address,
				birth, group);
	}

	@Override
	public void showData() {
		System.out.printf("이름 : %s\n전화번호 : %s\n", name, phone);
	}
}
