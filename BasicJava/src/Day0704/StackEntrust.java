package Day0704;

import java.util.Vector;

public class StackEntrust {
	Vector<String> vt = new Vector<>();

	void push(String item) {
		vt.add(item);
	}

	String pop() {
		return vt.remove(vt.size() - 1);
	}

	boolean isEmpty() {
		return vt.isEmpty();
	}

	int size() {
		return vt.size();
	}
}
