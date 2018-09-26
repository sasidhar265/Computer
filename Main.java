package computer;

public class Main 
{
	public static void main(String[] args) 
	{
		Bill bs = new Bill(178, 399, 71.82, 71.82, 49, 591.62);
		bs.display();

		/*Address ads = new Address("KPHB", "FocusDiagonist", "RoadNo:1", "Hyderabad", "Telangana", 500072);
		ads.display();*/
		
		/*Company co = new Company(null, null, null, ads);
		co.display();*/
		
		MotherBoard mb= new MotherBoard("MB-123456789", "DELL.Inc", 4, "one year warrenty");
		mb.display();
		
		/*KeyBoard kb = new KeyBoard(null, null, 0, null, null);
		kb.display();
		
		Cpu cpu = new Cpu(null, null, null, null, 0, null, null);
		cpu.display();
		
		Mouse mo = new Mouse(null, null, 0, 0, null, null);
		mo.display();
		
		RAM ram = new RAM(null, null, 0, 0, null, 0);
		ram.display();
		
		Monitor m = new Monitor(null, null, 0, 0, null, null, null, null, null);
		m.display();*/
				
	}

}
