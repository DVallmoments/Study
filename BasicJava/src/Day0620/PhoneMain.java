package Day0620;

public class PhoneMain {
	public static void main(String[] args) {
		IFunction ifunction = null;

		ifunction = new APhone();
		ifunction.Call();
		ifunction.Connect();
		ifunction.TVRemote();
		System.out.println("----------------------");

		ifunction = new BPhone();
		ifunction.Call();
		ifunction.Connect();
		ifunction.TVRemote();
		System.out.println("----------------------");

		ifunction = new CPhone();
		ifunction.Call();
		ifunction.Connect();
		ifunction.TVRemote();
		System.out.println("----------------------");
	}
}
