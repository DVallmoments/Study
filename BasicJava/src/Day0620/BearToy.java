package Day0620;

public class BearToy implements MoveArmLeg {
	@Override
	public void moveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void show() {
		System.out.println("곰돌이 입니다...");
		moveArmLeg();
		System.out.println("****************");
	}
}
