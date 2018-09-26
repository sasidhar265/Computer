package computer;

public class Computer 
{
	MotherBoard mb;
	KeyBoard kb;
	Cpu cpu;
	Mouse mo;
	RAM ram;
	Monitor m;
	Company co;
	Bill bs;
	Address ads;
	
	String motherBoard;
	String keyBoard;
	String Cpu;
	String mouse;
	String RAM;
	String monitor;
	 
	/*public void isComputerWorking()
	{
		
	}
	
	public void isComputerNotWorking()
	{
		
	}*/

	public Computer(String motherBoard, String keyBoard, Cpu cpu, String mouse, RAM ram, String monitor) 
	{
		super();
		this.motherBoard = motherBoard;
		this.keyBoard = keyBoard;
		this.cpu = cpu;
		this.mouse = mouse;
		this.ram = ram;
		this.monitor = monitor;
	}
	
	public void display()
	{
		System.out.println("MotherBoard of Computer: "+motherBoard);
		System.out.println("KeyBoard of Computer: "+keyBoard);
		System.out.println("CPU of Computer: "+cpu);
		System.out.println("Mouse of Computer: "+mouse);
		System.out.println("RAM of a Computer: "+ram);
		System.out.println("Monitor of Computer: "+monitor);
	}
}
