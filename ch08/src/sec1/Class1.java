package sec1;
//인터페이스로부터 상속 받는 클래스는 implements
public class Class1 implements Interface1 {
	//인터페이스로부터 상속 받는 클래스는 일반 메서드가 추상화되어 있으므로 반드시 오버라이딩하여
	//실제 구현 내용을 기술해야함
	@Override				//상속받은것은 속성을 넓힐 수 있다.(졸힐수는 없음)
	public void method() {
		System.out.println("메서드1 호출");
	}

	@Override
	public int method2(int pa1, String pa2) {
		System.out.println("pa1="+pa1+", pa2"+pa2);
		return pa1;
	}

}
