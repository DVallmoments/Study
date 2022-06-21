package Day0620;

public class RemoteControlMain {
	public static void main(String[] args) {
		Anonymous2 anony = new Anonymous2();

		anony.field.turnON();
		anony.field.turnOFF();

		anony.method1();

		anony.method2(new RemoteControl() {

			@Override
			public void turnON() {
				System.out.println("SmartTV를 켭니다.");
			}

			@Override
			public void turnOFF() {
				System.out.println("SmartTV를 끕니다.");
			}
		});
	}
}
