package sec1;

public class OuterEx1 {
	public static void main(String[] args) {
		//외부 클래스로 부터 유도된 인스턴스 = 외부 객체
		OuterClass out1 = new OuterClass();
		out1.method1();
		
		//내부 클래스로 부터 유도된 인스턴스 = 내부 객체
		OuterClass.Inner in1 = out1.new Inner();
		in1.method1();
		
		//내부 정적(static) 클래스는 인스턴스를 생성하려면 해당 ㅗ이부 클래스명으로 생성해야함

	}
			
}
