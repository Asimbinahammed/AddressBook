package bridgelabz;
import java.util.Scanner;

public class AddressBookSystem {
	
	/*
	 * UC1
	 * scanning details from user
	 */
	public static void main(String[] args) {
		int i=0;
		String array[]=new String[8];
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter firstname: ");
	    String fname = sc.nextLine();
	    array[i]=fname;
	    i++;
	    
	    System.out.print("Enter Last name: ");
	    String lname = sc.nextLine();
	    array[i]=lname;
	    i++;
	    
	    System.out.print("Enter address: ");
	    String address = sc.nextLine();
	    array[i]=address;
	    i++;
	    
	    System.out.print("Enter City: ");
	    String city = sc.nextLine();
	    array[i]=city;
	    i++;
	    
	    System.out.print("Enter state: ");
	    String state = sc.nextLine();
	    array[i]=state;
	    i++;
	    
	    System.out.print("Enter zip: ");
	    String zip = sc.nextLine();
	    array[i]=zip;
	    i++;
	    
	    System.out.print("Enter phone number: ");
	    String phno = sc.nextLine();
	    array[i]=phno;
	    i++;
	    
	    System.out.print("Enter Email: ");
	    String email = sc.nextLine();
	    array[i]=email;
	    i++;
	    
	    
	    for (int j = 0; j < array.length; j++) {
	    	System.out.println( array[j]+ " ");  
	    }
	}
	    
}
