package Day0616;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("--------------------------------------------------");
		}
	}

}
