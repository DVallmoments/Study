package Day0620;

public class ToyMain {
	public static void main(String[] args) {
		Toy toy = null;
		
		toy = new BearToy();
		toy.show();

		toy = new MazingerToy();
		toy.show();

		toy = new AirPlaneToy();
		toy.show();
	}
}
