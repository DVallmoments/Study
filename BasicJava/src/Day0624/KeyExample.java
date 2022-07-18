package Day0624;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<>();

		hashMap.put(new Key(1), "홍길동");

		String value = hashMap.get(new Key(1)); //벨류를 가져옴

		System.out.println(value);
	}
}
