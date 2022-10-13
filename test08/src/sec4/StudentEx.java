package sec4;

public class StudentEx {
	public static void main(String[] args) {
		Student1 st1 = new Student1();
		Student1 st2 = new Student1("김기태",90,80,90);
		System.out.println("이름\t총점\t평균\t학점\t판정");
		System.out.println(st2.name+"\t"+st2.calcTot()
				+"\t"+st2.calcAvg()+"\t"+st2.calcHak()
				+"\t"+st2.calcRes());
	}
}