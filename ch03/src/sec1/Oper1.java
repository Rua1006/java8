package sec1;
//프로그램(operation)의 모든 명령은 Op-code(연산자) 와 operand(핑연산자)로 이루어짐
//주소(기억장소의 개수)에 따라 0주소 명령어 형식 - 3주소 명령어 형식
//입력항에 따라 단항(unary) 연산과 이항(binary) 연산으로 분류됨
//연산의 종류에 따라 산술, 논리, 비교, 비트, 증강, 대입 연산 등이 있음

//a = a + b;
//+ : 연산(명령) -> Op-code
//a, b -> Operand
public class Oper1 {
	public static void main(String[] args) {
		int a=20, b=30,	c;
		System.out.println(a); //제1주소 명령
		prt();
		c = a+ b;
		//운용방식1 : +ab -> pre(fix) order(전위)
		//운용방식2 : ab+ -> post(fix) order(후위)
		//운용방식3 : a+b -> in(fix) order(중위)
	}

	
	public static void prt(){
			System.out.println("data");//제0주소 명령, 0~4주소 명령까지 존재
	}
}
