package Day0622;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadA의 methodB() 작업실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
}
