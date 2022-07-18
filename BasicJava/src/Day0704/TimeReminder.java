package Day0704;

class MP3 {
	void playSong() {
		System.out.println("노래를 재생합니다.");
	}
}

class TimeReminder {
	TimeProvider tProv;
	MP3 m = new MP3();

	public void setTimeProvider(TimeProvider tProv) {
		this.tProv = tProv;
	}

	void reminder() {
		int hours = tProv.getTime();
		if (hours >= 22)
			m.playSong();
	}

}

class Main {
	public static void main(String[] args) {
		TimeReminder sut = new TimeReminder();
		TimeProvider tProvStub = new FakeTimeProvider();
		tProvStub.setHours(22);
		sut.setTimeProvider(tProvStub);
	}
}
