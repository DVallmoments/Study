package Day0620;

public class AirPlaneToy implements Light, Misile {

	@Override
	public void onLight() {
		System.out.println("불빛 발사가 가능합니다.");
	}

	@Override
	public void shootMisile() {
		System.out.println("미사일 발사가 가능합니다.");
	}

	@Override
	public void show() {
		System.out.println("비행기입니다.");
		onLight();
		shootMisile();
		System.out.println("****************");
	}
}
