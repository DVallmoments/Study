package Day0602;
import java.util.Scanner;

public class Chap07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(name + "님 안녕하세요! " + age + "살 이네요!");
	}

}
