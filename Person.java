package projectrunning;

import projectrunning.Address;

class Person
{
	private String firstName;
	private String lastName;
	private String middleName;
	private String telephoneNumber;
	private Address address;

	
	public Person()
	{
		super();
	}
	
	public Person(String firstName, String lastName, String middleName, String telephoneNumber, Address address)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.telephoneNumber = telephoneNumber;
		this.address = address;
	}

	public Address getAddress()
	{
		return this.address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getMiddleName()
	{
		return this.middleName;
	}

	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}

	public String getTelephoneNumber()
	{
		return this.telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber)
	{
		this.telephoneNumber = telephoneNumber;
	}

	public void printValues()
	{
		System.out.println("Name: " + this.getfullName() + "     Phone Number: "
				+ this.correctWayToDisplayTheNumber(this.telephoneNumber) + "     Address: " + address.getStreet() + ", " + address.getCity()
				+ ", " + address.getState() + ", " + address.getZipCode());
	}

	public String correctWayToDisplayTheNumber(String telephoneNumber)
	{

		String number = "(" + telephoneNumber.substring(0, 3) + ")-" + telephoneNumber.substring(3, 6) + "-"
				+ telephoneNumber.substring(6, 10);

		return number;

	}

	public String getfullName()
	{

		String fullName = this.firstName + " " + this.middleName + " " + this.lastName;
		if (this.middleName == "")
		{
			return (this.firstName + " " + this.lastName);
		} else
		{
			return fullName;
		}
	}

}
