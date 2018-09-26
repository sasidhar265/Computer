package computer;

public class MotherBoard 
{
	String id;
	String company;
	int qualityRating;
	String warrentyPeriod;
	Bill bs;
	Address ads;
	Company co;
	
	public void working()
	{
		
	}
	
	public void notWorking()
	{
		
	}
	
	public MotherBoard(String id, String company, int qualityRating, String warrentyPeriod)
	{
		super();
		this.id = id;
		this.company = company;
		this.qualityRating = qualityRating;
		this.warrentyPeriod = warrentyPeriod;
		
	}
	
	public void display()
	{
		System.out.println("MotherBoard id: "+id);
		System.out.println("CompanyName: "+company);
		System.out.println("QualityRating: "+qualityRating);
		System.out.println("WarrentyPeriod: "+warrentyPeriod);
		System.out.println(bs);
		System.out.println();

	}

}