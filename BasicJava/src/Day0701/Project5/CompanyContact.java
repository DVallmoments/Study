package Day0701.Project5;

public class CompanyContact extends Contact {
	private String companyName;
	private String departmentName;
	private String companyPosition;

	public CompanyContact() {
	}

	public CompanyContact(String name, String phone, String email, String address, String birth, String group,
			String companyName, String departmentName, String companyPosition) {
		super(name, phone, email, address, birth, group);
		this.companyName = companyName;
		this.departmentName = departmentName;
		this.companyPosition = companyPosition;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCompanyPosition() {
		return companyPosition;
	}

	public void setCompanyPosition(String companyPosition) {
		this.companyPosition = companyPosition;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("회사이름 : %s\n부서이름 : %s\n직급 : %s\n", companyName, departmentName, companyPosition);
		System.out.println("-------------------");
	}

	@Override
	public void showData() {
		System.out.printf("이름 : %s\n전화번호 : %s\n", getName(), getPhone());
	}
}
