package sec3;

public class SystemEx3 {
//쓰레드가 걸린 시간 측정 = 성능 측정
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i=1; i<10000000; i++){
			sum+=i;
		}
		
		long time2 = System.nanoTime();
		//초>밀리초>마이크로초>나노초
		System.out.println("합산 결과  : "+sum);
		System.out.println("걸린 시간  : "+(time2-time1));
	}

}
