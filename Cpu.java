package computer;

public class Cpu 
{
	String cpuId;
	String company;
	String qualityRating;
	String warrentyRating;
	double speed;
	String type;
	Bill bs;
	Address ads;
	Company co;
	
	public void isCPUWorking()
	{
		
	}
	
	public void isCPUNotWorking()
	{
		
	}

	public Cpu(String cpuId, String company, String qualityRating, String warrentyRating, double speed, String type,
			String bill) 
	{
		super();
		this.cpuId = cpuId;
		this.company = company;
		this.qualityRating = qualityRating;
		this.warrentyRating = warrentyRating;
		this.speed = speed;
		this.type = type;
	}
	
	public void display()
	{
		System.out.println("CPU ID: "+cpuId);
		System.out.println("Company: "+company);
		System.out.println("Quality: "+qualityRating);
		System.out.println("Warrenty: "+warrentyRating);
		System.out.println("Speed in GHZ: "+speed);
		System.out.println("Type of Processor: "+type);
		System.out.println("Bill: "+bs);
	}
}