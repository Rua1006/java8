package sec1;

public class MemberEx {
	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자함수();
		Member mem1 = new Member();
		mem1.setId("KBS");
		mem1.setPassword("1234");
		System.out.println("아이디 : "+mem1.getId());
		System.out.println("비밀번호  : "+mem1.getPassword());
		System.out.println("이름 : "+mem1.getName());
		System.out.println("주소 : "+mem1.getAddress());
		
		Member mem2 = new Member();
		mem2.setId("JDI");
		System.out.println("아이디 : "+mem2.getId());
		System.out.println("비밀번호 : "+mem2.getPassword());
		

		Member mem3 = new Member("jdi","kad");
		Member mem4 = new Member("kkm","강","경","민");

		System.out.println("당신의 아이디: "+mem3.getId());
		System.out.println("당신의 사는곳: "+mem4.getAddress());
		
		MemberController mc = new MemberController();
		mc.join("KBS", "1234", "강병수");
		mc.info();
		mc.login("KBS", "1234");
		mc.info();
		
	}

		
}
