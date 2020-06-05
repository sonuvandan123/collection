package overridingloading;

public class ICICI extends Bank
{
	@Override
	public int getRateOfInterest()
	{
		return 4;
	}
}
