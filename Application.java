package projectrunning;

import java.util.Scanner;

public class Application
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);


        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // person 1
        Address ad1 = new Address();
        ad1.setStreet("114 Market St");
        ad1.setCity("St Louis");
        ad1.setState("MO");
        ad1.setZipCode("63403");

        p1.setFirstName("John");
        p1.setMiddleName("");
        p1.setLastName("Doe");
        p1.setTelephoneNumber("6366435698");
        p1.setAddress(ad1);

        // person 2
        Address ad2 = new Address();
        ad2.setStreet("324 Main St");
        ad2.setCity("St Charles");
        ad2.setState("MO");
        ad2.setZipCode("63303");

        p2.setFirstName("John");
        p2.setMiddleName("E");
        p2.setLastName("Doe");
        p2.setTelephoneNumber("8475390126");
        p2.setAddress(ad2);

        // person 3
        Address ad3 = new Address();
        ad3.setStreet("574 Pole ave");
        ad3.setCity("St Peters");
        ad3.setState("MO");
        ad3.setZipCode("63333");

        p3.setFirstName("John");
        p3.setMiddleName("Michael West");
        p3.setLastName("Doe");
        p3.setTelephoneNumber("5628592375");
        p3.setAddress(ad3);


        Person[] persons =
                { p1, p2, p3 };

        Phonebook pb = new Phonebook(persons);

        int choice;

        do
        {
            System.out.println("******************** Welcome to my Phonebook! ********************");
            System.out.println("**** What would you like to do? Choose between 1, 2, 3... etc ****");
            System.out.println("1. Add new contact.");
            System.out.println("2. Search by full name.");
            System.out.println("3. Search by first name.");
            System.out.println("4. Search by last name.");
            System.out.println("5. Search by telephone number.");
            System.out.println("6. Search by address(city).");
            System.out.println("7. Delete a record.");
            System.out.println("8. Update a record.");
            System.out.println("9. Show all records.");
            System.out.println("10. Exit.");

            choice = s.nextInt();
            s.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.println("Please enter the required infromation below/n");

                    System.out.println("Enter the first name");
                    String firstName = s.nextLine();
                    System.out.println("Enter the middle name");
                    String middleName = s.nextLine();
                    System.out.println("Enter the last name");
                    String lastName = s.nextLine();
                    System.out.println("Enter the telephone number");
                    String telephoneNumber = s.nextLine();
                    System.out.println("Enter the street(number and name)");
                    String street = s.nextLine();
                    System.out.println("Enter the city");
                    String city = s.nextLine();
                    System.out.println("Enter the state");
                    String state = s.nextLine();
                    System.out.println("Enter a zip code");
                    String zipCode = s.nextLine();

                    Person p4 = new Person();

                    Address ad4 = new Address();
                    ad4.setStreet(street);
                    ad4.setCity(city);
                    ad4.setState(state);
                    ad4.setZipCode(zipCode);

                    p4.setFirstName(firstName);
                    p4.setMiddleName(middleName);
                    p4.setLastName(lastName);
                    p4.setTelephoneNumber(telephoneNumber);
                    p4.setAddress(ad4);

                    pb.addRecord(p4);

                    break;

                case 2:
                    System.out
                            .println("What is the  first, middle(if any) and last name of the person you are looking for?");

                    pb.SearchByFullName(s.nextLine());

                    break;

                case 3:
                    System.out.println("What is the first name of the person you are looking for?");

                    String fname = s.nextLine();
                    pb.SearchByFirstName(fname);

                    break;

                case 4:
                    System.out.println("What is the last name of the person you are looking for?");

                    pb.SearchByLastName(s.nextLine());

                    break;

                case 5:
                    System.out.println("What is the telephone number of the person you are looking for?");

                    pb.SearchByTelephoneNumber(s.nextLine());

                    break;

                case 6:
                    System.out.println("Enter the name of the city where the person you are looking for lives.");

                    pb.SearchByAddress(s.nextLine());

                    break;

                case 7:
                    System.out.println("What is the telephone number related to account you are looking to delete?");
                    String phoneNumberOfAccountToBeDeleted = s.nextLine();
                    pb.deleteRecord(phoneNumberOfAccountToBeDeleted);

                    break;

                case 8:

                    System.out.println("What is the telephone number related to account you are looking to update?");
                    String telNumber = s.nextLine();

                    System.out.println("Please enter first name.");
                    String fName = s.nextLine();
                    System.out.println("Please enter middle name.");
                    String mName = s.nextLine();
                    System.out.println("Please enter last name.");
                    String lName = s.nextLine();
                    System.out.println("Please enter street(number and name).");
                    String STREET = s.nextLine();
                    System.out.println("Please enter city.");
                    String CITY = s.nextLine();
                    System.out.println("Please enter state.");
                    String STATE = s.nextLine();
                    System.out.println("Please enter zipCode");
                    String ZIPCODE = s.nextLine();

                    pb.editRecord(telNumber, fName, mName, lName, STREET, CITY, STATE, ZIPCODE);

                    break;

                case 9:
                    System.out.println("Here're all the available records in this phonebook.\n");
                    pb.printall();
                    break;

                case 10:

                    break;

            }

        } while (choice != 10);
        System.out.println("You are exiting the phonebook. Have a wondefrul day.");

        s.close();

    }
}
