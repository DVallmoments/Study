package Day0620;

public class MazingerToy implements Misile, MoveArmLeg {
	@Override
	public void shootMisile() {
		System.out.println("미사일을 발사 할 수 있습니다.");
	}

	@Override
	public void moveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void show() {
		System.out.println("마징가입니다.");
		moveArmLeg();
		shootMisile();
		System.out.println("****************");
	}
}
