package Day0616;

public class Store2 extends CenterStore {
	@Override
	public void name() {
		System.out.println("매장2호점");
	}

	@Override
	public void jja() {
		System.out.println("자장면 - 5000원");
	}

	@Override
	public void jjam() {
		System.out.println("짬뽕 - 5000원");
	}

	@Override
	public void tang() {
		System.out.println("탕수육 - 10000원");
	}

	@Override
	public void gun() {
		System.out.println("군만두 - 3000원");
	}

	@Override
	public void rice() {
		System.out.println("공기밥 - 무료");
	}
}
