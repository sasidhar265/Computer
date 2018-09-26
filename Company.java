package computer;

public class Company 
{
	String companyId;
	String companyName;
	String companyEmail;
	Address ads;
	private Address Address;
	
	public Company(String id, String name, String email, Address ads) 
	{
		super();
		this.companyId = id;
		this.companyName = name;
		this.companyEmail = email;
		this.Address = ads;
		
	}
	
	public void display()
	{
		System.out.println("Company_Id: "+companyId);
		System.out.println("CompanyName: "+companyName);
		System.out.println("CompanyEmail_Id: "+companyId);
		System.out.println("CompanyAddress: "+ads);
	}
}
