package test1;

public class test00 {

	public static void main(String[] args) {
		int a=100, b=23, c;
		float d, e, f;
		String h;
		c = a / b;		//4 -> 자동 형 변환
		System.out.println("c="+c);
		d = (float)a / b;		//4.0 -> 자동 형 변환  (float)추가 시 그 값을 무조건으로 나옴
		System.out.println("d="+d);
		e = 500 / 3;
		System.out.println(e);
	
	}

}
