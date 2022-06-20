package Day0620;

public class Anonymous2 {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnON() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOFF() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnON() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOFF() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnON();
		localVar.turnOFF();
	}

	void method2(RemoteControl rc) {
		rc.turnON();
		rc.turnOFF();
	}
}
