package Day0617;

public class ParentMain {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent;
		child.field1 = "aa";
		child.method1();
		child.method2();
		child.method3();
	}

}
