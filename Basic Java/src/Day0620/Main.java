package Day0620;

public class Main {
	public static void main(String[] args) {
		Sonata sonata = null;

		sonata = new SonataLowGrade(CarSpecs.BLUECOLOR, CarSpecs.NORMALTIRE, CarSpecs.LOWDISPLACEMENT,
				CarSpecs.POWERHANDLE);
		sonata.getSpec();

		sonata = new SonataHighGrade(CarSpecs.REDCOLOR, CarSpecs.WIDETIRE, CarSpecs.HIGHDISPLACEMENT,
				CarSpecs.NORMALHANDLE);
		sonata.getSpec();
	}
}
