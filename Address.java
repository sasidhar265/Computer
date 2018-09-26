package computer;

public class Address 
{
	String place;
	String building;
	String street;
	String city;
	String state;
	int pincode;
		
	public Address(String place, String building, String street, String city, String state, int pincode) 
	{
		super();
		this.place = place;
		this.building = building;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public void display()
	{
		System.out.println("Place: "+place);
		System.out.println("BuildingNumber: "+building);
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("PinCodeNumber: "+pincode);
	}
	
}
