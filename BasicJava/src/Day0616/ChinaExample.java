package Day0616;

public class ChinaExample {
	public static void main(String[] args) {
		CenterStore cs = new CenterStore();
		CenterStore cs1 = new Store1();
		CenterStore cs2 = new Store2();
		CenterStore cs3 = new Store3();

		cs.menu();
		System.out.println();
		cs1.menu();
		System.out.println();
		cs2.menu();
		System.out.println();
		cs3.menu();
	}
}
