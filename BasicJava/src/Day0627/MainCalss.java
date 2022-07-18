package Day0627;

import java.util.StringTokenizer;

public class MainCalss {
	public static void main(String[] args) {
		String str1 = "오늘의 날씨는 약간 쌀쌀하고 단풍이 무르익고 있습니다.";
		String str2 = "2020/10/31";

		System.out.println(str1);
		System.out.println(str2);

		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2, "/");

		System.out.println("tokenizer1: " + tokenizer1.countTokens());
		System.out.println("tokenizer2: " + tokenizer2.countTokens());

		while (tokenizer1.hasMoreTokens())
			System.out.println(tokenizer1.nextToken());

		while (tokenizer2.hasMoreTokens())
			System.out.println(tokenizer2.nextToken());

	}
}
