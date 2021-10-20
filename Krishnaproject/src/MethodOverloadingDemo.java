
public class MethodOverloadingDemo {
	void Sum(int a,int b) {
		System.out.println("a+b:" +(a+b));
	
	}
	void Sum(int m,int n,int o) {
		System.out.println("m+n+o:" +(m+n+o));
	}
	void Sum(float p,float q) {
		System.out.println("p+q:" +(p+q));
	}
	
	public static void main(String args[]) {
		MethodOverloadingDemo mod=new MethodOverloadingDemo();
		
		mod.Sum(2,3);
		mod.Sum(2, 3,5);
		mod.Sum(1.1f,1.2f);
		
		
		
	}
	

}
