package Day0622;

public class ThreadA2 extends Thread {
	private WorkObject workObject;

	public ThreadA2(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
