package sec3;

public class Loop7 {

	public static void main(String[] args) {
		int[][] a = {{10,20,30,40},{50,60,70,80},{15,25,35,45},{55,65,75,85}};
		for(int i=0; i<a.length; i++){
			System.out.println(a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]);
		}
		System.out.println("*********************************");		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]+"\t");
			}			
			System.out.print("\n");
		}
		}
}
