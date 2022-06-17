package Day0608;

public class ArrayTest {
	public static void main(String[] args) {
		Member[] members = new Member[5];
		
		members[0] = new Member();
		members[0].memberNo = 1;
		members[0].memberId = "aaa";
		members[0].memberName = "임영웅";
		
		members[1] = new Member();
		members[1].memberNo = 2;
		members[1].memberId = "bbb";
		members[1].memberName = "영탁";
		
		members[2] = new Member();
		members[2].memberNo = 3;
		members[2].memberId = "ccc";
		members[2].memberName = "손흥민";
		
		members[3] = new Member();
		members[3].memberNo = 4;
		members[3].memberId = "ddd";
		members[3].memberName = "박지성";
		
		members[4] = new Member();
		members[4].memberNo = 5;
		members[4].memberId = "eee";
		members[4].memberName = "차두리";
		
//		members[0] = new Member(1, "aaa", "임영웅");
//		members[1] = new Member(2, "bbb", "영탁");
//		members[2] = new Member(3, "ccc", "손흥민");
//		members[3] = new Member(4, "ddd", "박지성");
//		members[4] = new Member(5, "eee", "차두리");

		for (int i = 0; i < members.length; i++)
			System.out.printf("%d번 회원의 아이디는 %s이고, 이름은 %s입니다.\n", members[i].memberNo, members[i].memberId,
					members[i].memberName);
	}
}
