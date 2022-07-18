package Day0624;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("Day0624.SendAction");
			Class clazz = Class.forName("Day0624.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
