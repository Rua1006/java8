package sec2;

public class RemoteEx1 {

	public static void main(String[] args) {
		RemoteControl rc1;
		RemoteControl rc2;
		rc1 = new Television();
		rc2 = new Audio();
		
		//rc1 = new Audio(); //생성하여 형변환
		// rc2 = rc1; //자동 형변환
		//rc1 = rc2; //자동 형변환
	}
}
