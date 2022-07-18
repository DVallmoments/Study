package Day0704;

public class DiscountedBag extends Bag {
	private double DiscountedRate = 0;

	public double getDiscountedRate() {
		return DiscountedRate;
	}

	public void setDiscountedRate(double discountedRate) {
		DiscountedRate = discountedRate;
	}

	public void applyDiscount(int price) {
		super.setPrice(price - (int) (DiscountedRate * price));
	}
}
