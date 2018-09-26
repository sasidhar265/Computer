package computer;

public class Mouse 
{
	String mouseId;
	String company;
	double qualityRating;
	double warrentyRating;
	String type;
	Bill bs;
	Address ads;
	Company co;
	
	public void isMouseWorking()
	{
		
	}
	
	public void isMouseNotWorking()
	{
		
	}

	public Mouse(String mouseId, String company, double qualityRating, double warrentyRating, String bill,
			String type) 
	{
		super();
		this.mouseId = mouseId;
		this.company = company;
		this.qualityRating = qualityRating;
		this.warrentyRating = warrentyRating;
		this.type = type;
	}
	
	public void display()
	{
		System.out.println("Mouse ID: "+mouseId);
		System.out.println("Company: "+company);
		System.out.println("Quality: "+qualityRating);
		System.out.println("Warrenty: "+warrentyRating);
		System.out.println("Type of Mouse: "+type);
		System.out.println("Bill: "+bs);
	}
}

