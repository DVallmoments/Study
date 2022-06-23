package Day0621;

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
		System.out.printf("거래처이름 : %s\n품목이름 : %s\n직급 : %s\n", companyName, departmentName, companyPosition);
		System.out.println("-------------------");
	}
}
