package Day0704;

public class KidMain {
	public static void main(String[] args) {
		Toy t = new Robot();
		Kid k = new Kid();

		k.setToy(t);
		k.play();
	}
}
