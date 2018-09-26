package computer;

public class Monitor 
{
	String monitorId;
	String company;
	double qualityRating;
	double warrentyRating;
	String type;
	String size;
	String width;
	String height;
	Bill bs;
	Address ads;
	Company co;
	
	public void isMonitorWorking()
	{
		
	}
	
	public void isMonitorNotWorking()
	{
		
	}

	public Monitor(String monitorId, String company, double qualityRating, double warrentyRating, String type, 
			String size, String width, String height, String bill) 
	{
		super();
		this.monitorId = monitorId;
		this.company = company;
		this.qualityRating = qualityRating;
		this.warrentyRating = warrentyRating;
		this.type = type;
		this.size = size;
		this.width = width;
		this.height = height;
		
	}
	
	public void display()
	{
		System.out.println("Monitor ID: "+monitorId);
		System.out.println("Company: "+company);
		System.out.println("Quality: "+qualityRating);
		System.out.println("Warrenty: "+warrentyRating);
		System.out.println("Type of Monitor: "+type);
		System.out.println("Size of Monitor: "+size);
		System.out.println("Width of Monitor: "+width);
		System.out.println("Height of Monitor: "+height);
		System.out.println("Bill: "+bs);
	}

}
