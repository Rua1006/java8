package sec1;

public class ClassEx3 {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);	//첫번째 방법
		Box<String> box0 = Util.<String>boxing("강병수");
		int intValue = box1.get();
		System.out.println(intValue);
		String strValue0 = box0.get();
		System.out.println(strValue0);
		Box<String> box2 = Util.boxing("강병수");	//두번째 방법
		String strValue = box2.get();
	}

}
class Util{
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
class Box<T>{
	private T t;
	public T get() {return t;}
	public void set (T t) {this.t = t;}
}