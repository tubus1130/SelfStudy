package chapter08;

public class ReferenceConstructor {
	public static void main(String[] args) {
		ReferenceConstructor reference = new ReferenceConstructor();
		reference.makeMemberObject();
	}
	
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Kim");
		MemberDTO dto3 = new MemberDTO("Kim", "01012345678");
		MemberDTO dto4 = new MemberDTO("Kim", "01012345678", "kim@gmail.com");
	}
}
