package Day0616;

public class ComputerExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Computer computer = new Computer();

		int r = 10;

		System.out.println("원의 면적은: " + calculator.areaCircle(r));
		System.out.println("원의 면적은: " + computer.areaCircle(r));
	}
}
