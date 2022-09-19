package sec1;

//import 파일명; : 불러올수있음


//public : 현재 프로젝트내에서 다른 패키지에서도 접근 가능
//default : 접근 제한자를 생략했을 경우이며,같은 패키지 내에서 접근 가능
//private : 현재 클래스 내부에서만 접근 가능

public class Member {				//하나의 파일 안에 여러개의 클래스가 있을 수 있다
	private String id;						//클래스의 멤버 필드	(Field)
	private String password;
	private String name;
	private String address;
	private String tel;
	private String reg_date;
	
	//아래 부분은 기본 생성자(constructor)로서 선언하지 않아도 자동으로 자바가 생성자를 묵시적으로 선언함
	public Member() { }
	
	//생성자 (String, String)
	public Member(String id, String password){
		this.id = id;
		this.password = password;
	}
		
	public Member(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		
	
	}
	
	public Member(String id, String password, String name, String address,String tel) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	//접근제한자 반환타입 메서드명([매개변수타입 매개변수명, ....]) {	return 반환변수명 | 값;}
	//접근제한자 void 메서드명([매개변수타입 매개변수명, ....]) {	실행문;  }
	

	public String getId() { //클래스의 멤버 메서드(Method)
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
	
}
