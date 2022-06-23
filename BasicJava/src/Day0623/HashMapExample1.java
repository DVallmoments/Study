package Day0623;

import java.util.*;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());

		System.out.println("\t홍길동: " + map.get("홍길동"));
		System.out.println();

		Set<String> keySet = map.keySet();	//맵의 모든키를 keySet에 담아서 리턴
		Iterator<String> keyIterator = keySet.iterator(); //keyIterator에 String타입으로 ketSet모든 값을 가져옴
		while (keyIterator.hasNext()) {	//읽어올 요소가 남아있는지 확인
			String key = keyIterator.next(); //다음데이터 반환
			Integer value = map.get(key); //주어진 키의 값을 리턴
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();

		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	//entrySet()메소드로 모든 map.entry를 entrySet에 얻음
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator(); //반복자를 통하여 entryIterator에 키와 벨류값을 얻고
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); 
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}

	}
}
