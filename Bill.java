package computer;

public class Bill 
{
	int billNumber;
	double baseProductPrice;
	double serviceTax;
	double centralTax;
	double transportTax;
	double finalPrice;
	
	public void billTime()
	{
		
	}
	
	public void billDispatch()
	{
		
	}
	
	public Bill(int billNumber, double baseProductPrice, double serviceTax, double centralTax, double transportTax,
			double finalPrice) 
	{
		super();
		this.billNumber = billNumber;
		this.baseProductPrice = baseProductPrice;
		this.serviceTax = serviceTax;
		this.centralTax = centralTax;
		this.transportTax = transportTax;
		this.finalPrice = finalPrice;
	}
			
	public void display()
	{
		System.out.println("BillNumber: "+billNumber);
		System.out.println("BasePrice: "+baseProductPrice);
		System.out.println("ServiceTax: "+serviceTax);
		System.out.println("CentralTax: "+centralTax);
		System.out.println("TransportTax: "+transportTax);
		System.out.println("FinalPrice: "+finalPrice);
		System.out.println();
	}
		
}
