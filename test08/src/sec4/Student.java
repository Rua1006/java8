package sec4;

public abstract class Student {
	String schoolname;
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	
	abstract int computeTot(int jum1, int jum2, int jum3);
	abstract double computeAvg(int jum1, int jum2, int jum3);

	public String computeHak(int jum1, int jum2, int jum3){
		int tot = jum1+jum2+jum3;
		if(tot/3>=90){
			return "A";
		} else if(tot/3>=80){
			return "B";
		} else if(tot/3>=70){
			return "C";
		} else if(tot/3>=60){
			return "D";
		} else {
			return "F";
		}
	}
}
