
public class MethodOverridingDemo {

	public static void main(String args[]) {
		RBI rbi=new RBI();
		HDFC hdfc=new HDFC();
		SBI sbi=new SBI();
		
		rbi.InterestRate();
		hdfc.InterestRate();
		sbi.InterestRate();
	}
}
