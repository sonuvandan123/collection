package overridingloading;

public class MainImplOverridingBank {

	public static void main(String[] args)
	{
		SBI sbi=new SBI();
		System.out.println(sbi.getRateOfInterest());
		
		ICICI icici=new ICICI();
		System.out.println(icici.getRateOfInterest());
	}

}
