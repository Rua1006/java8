package sec1;
//인터페이스는 완전 추상체이다.
//인터페이스는 추상체이므로 직접 해당 생성자를 활용하여 객체를 생성할 수 없다.
//기본적으로 abstract이 붙은것과 동일하다. 하지만 static, default는 abstract을 무시하기 때문에 선언과 실행내용을 모두 기술 해야한다.
public interface Interface1 {
	int MAX = 20; //상수 필드
	int MIN = 1; 
	
	void method(); //멤버 메서드는 선언만 가능하며, 실행 내용은 기술할 수 없다.
	int method2(int pa1, String pa2);
	static void method3(int pa1){ //정적 메서드는 선언과 실행내용을 모두 기술
		System.out.println(pa1+"값을 전달받았습니다.");
	}
	default int method4(String pa1){ //디폴트 메서드는 선언과 실행내용을 모두 기술
		return 1004;
	}
}
