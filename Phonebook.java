		/*
		 * Write a program to simulate the actions of a phonebook. (Due next Wednesday) 
Your program should be able to :
Add new entries     ??
Search for an existing entry    ??
Search by first name *         ??
Search by last name *          ??
Search by full name *note name is not unique therefore the result should be an array of Person Objects. ?????????
Search by telephone number  ?? 
Search by city or state     ?? 
Delete a record for a given telephone number  ??? 
Update a record for a given telephone number  ???
Show all records in asc order *note you will need to research sorting on an array.   ??? 
An option to exit the program   ??? boolean
Your program should operate on the console. It should display all the choices when the program loads. Eg 1. Add new record
    2. Delete a record
               Etc.. where 1 representing the action for adding a record and 2 representing the action
               for deleting a record.
Your program should run until the user selects the exit option.    ???? 
Your program should have a minimum of 2 classes a Person class, an Address  class.   !





Test case :
John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
John E Doe, 324 Main St, St Charles, MO,63303, 8475390126
John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375
Note: Test cases should work when copy and paste into the console as one entry (as is).
           ONLY ARRAYS ARE ALLOWED, NO ARRAYLIST.
 
 Searching for John should return a list of all 3 records above, displaying the telephone number in this order (636)-453-8563.

Optional add additional features to your program, for storing cell, home, work and fax numbers. 
Also features for storing events like birthday, anniversary, email… etc   

		 */

package projectrunning;

public class Phonebook

{
	private Person[] persons;

	public Phonebook(Person[] persons)
	{
		super();
		this.persons = persons;
	}

	public Person[] getPersons()
	{
		return persons;
	}

	public void setPersons(Person[] persons)
	{
		this.persons = persons;
	}

	public void SearchByFirstName(String firstName)
	{
		for (Person personItem : this.persons)
		{
			if (personItem.getFirstName().equals(firstName))
			{
				personItem.printValues();
			} 
			

		}
	}

	public void SearchByLastName(String lastName)
	{
		for (Person personItem : this.persons)
		{
			if (personItem.getLastName().equals(lastName))
			{
				personItem.printValues();
			} 
			

		}
	}

	public void SearchByFullName(String fullName)
	{
		for (Person personItem : this.persons)
		{
			if (personItem.getfullName().equals(fullName))
			{
				personItem.printValues();
			}
			
		}
	}

	public void SearchByTelephoneNumber(String telephoneNumber)
	{
		for (Person personItem : this.persons)
		{
			if (personItem.getTelephoneNumber().equals(telephoneNumber))
			{
				personItem.printValues();
			} 
			

		}
	}

	public void SearchByAddress(String city)
	{
		for (Person personItem : this.persons)
		{
			if (personItem.getAddress().getCity().equals(city))
			{
				personItem.printValues();
			}
			
		}
	}

	public void printall()
	{
		for (Person personItem : this.persons)
		{
			personItem.printValues();

		}
	}

	public void deleteRecord(String telephoneNumber)
	{
		Person[] newArray = new Person[persons.length - 1];

		for (int i = 0; i < this.persons.length; i++)
		{
			if (telephoneNumber.equals(this.persons[i].getTelephoneNumber()))
			{
				for (int j = 0; j < i; j++)
				{
					newArray[j] = this.persons[j];

				}
				for (int k = i; k < this.persons.length - 1; k++)
				{
					newArray[k] = this.persons[k + 1];
				}
			}

		}
		this.persons = newArray;
		System.out.println("***The record was successfully deleted.***");
	}

	public void editRecord(String telephoneNumber, String firstName, String middleName, String lastName, String street,
			String city, String state, String zipCode)
	{
		for (int i = 0; i < this.persons.length; i++)
		{
			if (telephoneNumber.equals(this.persons[i].getTelephoneNumber()))
			{
				this.persons[i].setFirstName(firstName);
				this.persons[i].setMiddleName(middleName);
				this.persons[i].setLastName(lastName);
				this.persons[i].getAddress().setStreet(street);
				this.persons[i].getAddress().setCity(city);         //!!!!!!!!!!!!(last 4)
				this.persons[i].getAddress().setState(state);
				this.persons[i].getAddress().setZipCode(zipCode);

			}
		}
	}

	public void addRecord(Person person)
	{
		Person[] newArray = new Person[persons.length + 1];
		for (int i = 0; i < this.persons.length; i++)
			newArray[i] = this.persons[i];
		newArray[persons.length] = person;
		this.persons = newArray;
		System.out.println("***New record was successfully created.***");
	}

}
