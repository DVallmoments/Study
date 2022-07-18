package Day0627;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		
		stringBuilder.append("hijklmn");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "aaa");
		System.out.println(stringBuilder);
		
		stringBuilder.replace(0, 4, "rrrrr");
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3,5);
		System.out.println(stringBuilder);
		
	}
}
