package computer;

public class KeyBoard 
{
	String keyBoardId;
	String company;
	int qualityRating;
	String warrentyPeriod;
	Bill bs;
	Address ads;
	Company co;
	
	public void isKeyBoardWorking()
	{
		
	}
	
	public void isKeyBoardNotWorking()
	{
		
	}
	
	public KeyBoard(String id, String company, int rating, String warrenty, String bill)
	{
		super();
		this.keyBoardId = id;
		this.company = company;
		this.qualityRating = rating;
		this.warrentyPeriod = warrenty;
		
		
	}
	
	public void display()
	{
		System.out.println("KeyBoardId: "+keyBoardId);
		System.out.println("Company: "+company);
		System.out.println("QualityRating: "+qualityRating);
		System.out.println("Warrenty: "+warrentyPeriod);
		System.out.println("Bill: "+bs);
	}
	
}
