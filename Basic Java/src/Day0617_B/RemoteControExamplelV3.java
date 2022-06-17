package Day0617_B;

public class RemoteControExamplelV3 {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		rc.turnON();
		rc.turnOFF();
		rc.setMute(true);
		searchable.search("www.naver.com");
	}
}
