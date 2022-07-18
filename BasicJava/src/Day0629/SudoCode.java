package Day0629;

public class SudoCode {
	public static void main(String[] args) {
		Car car = new Car("아우디", "AA방법");

		changeOil(car);
	}

	public static void changeOil(Car car) {
		System.out.println(car.name + "는 " + car.way + "으로 교환합니다.");
	}
}
