package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student() {} 
	public Student(String name){this.name=name;}
	public Student(String name, int kor, int eng, int mat){this.name=name; this.kor=kor; this.eng=eng; this.mat=mat;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int calcTot(){
		return kor+eng+mat;
	}
	public int calcAvg(){
		return (kor+eng+mat)/3;
	}
	public String calcHak(){
		int avg=calcAvg();
		String hak;
		if (avg>=90){
			hak="A";
		}else if (avg>=80){
			hak="B";
		}else if (avg>=70){
			hak="C";
		}else{
			hak="D";
		}
		return hak;
				
	}
	public String calcRes(){
		int avg=calcAvg();
		String res;
		if (avg>=80){
			res="합격";
		}else{
			res="불합격";
		}
		return res;
	}
}
	