package Day0617_B;

public class RemoteControlExampleV2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnON() {
				System.out.println("Power Turn ON");
			}

			@Override
			public void turnOFF() {
				System.out.println("Power Turn OFF");
			}

			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME)
					volume = RemoteControl.MAX_VOLUME;
				else if (volume < RemoteControl.MIN_VOLUME)
					volume = RemoteControl.MIN_VOLUME;
				System.out.println("현재 볼륨: " + volume);
			}
		};

		rc = new Television();
		rc.turnON();
		rc.setVolume(2);
		rc.turnOFF();
		rc.setMute(true);

		System.out.println();
		
		rc = new Audio();
		rc.turnON();
		rc.setVolume(7);
		rc.turnOFF();
		rc.setMute(true);

		System.out.println();
		
		RemoteControl.changeBettery();
	}
}