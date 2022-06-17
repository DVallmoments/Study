package Day0617_B;

public class RemoteControExamplelV1 {
	public static void main(String[] args) {
		RemoteControl rc;

		rc = new Television();
		rc.setMute(true);
		rc.turnON();
		rc.turnOFF();

		System.out.println("-----------");

		rc = new Audio();
		rc.setMute(true);
		rc.turnON();
		rc.turnOFF();
	}
}
