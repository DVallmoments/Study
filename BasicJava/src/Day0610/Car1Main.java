package Day0610;

public class Car1Main {
	public static void main(String[] args) {
		Car1 myCar = new Car1();

		myCar.setSpeed(-50);

		System.out.println("현재 속도:" + myCar.getSpeed());

		myCar.setSpeed(60);

		System.out.println("현재 속도:" + myCar.getSpeed());

		if (myCar.isStop()) {
			myCar.setStop(false);
		} else {
			myCar.setStop(true);
			System.out.println("현재 속도:" + myCar.getSpeed());
			System.out.println("멈춥니다.");
		}
	}
}
