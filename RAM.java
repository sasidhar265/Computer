package computer;

public class RAM 
{
	String ramId;
	String company;
	double qualityRating;
	double warrentyRating;
	int capacity;
	Bill bs;
	Address ads;
	Company co;
	
	public void isRAMWorking()
	{
		
	}
	
	public void isRAMNotWorking()
	{
		
	}

	public RAM(String ramId, String company, double qualityRating, double warrentyRating, String bill,
			int capacity) 
	{
		super();
		this.ramId = ramId;
		this.company = company;
		this.qualityRating = qualityRating;
		this.warrentyRating = warrentyRating;
		this.capacity = capacity;
	}
	
	public void display()
	{
		System.out.println("RAM ID: "+ramId);
		System.out.println("Company: "+company);
		System.out.println("Quality: "+qualityRating);
		System.out.println("Warrenty: "+warrentyRating);
		System.out.println("Bill: "+bs);
		System.out.println("Capacity of RAM in GB: "+capacity);
	}

}
