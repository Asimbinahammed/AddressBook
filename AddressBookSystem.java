package bridgelabz;
import java.util.Scanner;

public class AddressBookSystem {
	
	/*
	 * UC1
	 * scanning details from user
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter firstname");
	    String fname = sc.nextLine();
	    
	    System.out.print("Enter Last name");
	    String lname = sc.nextLine();
	    
	    System.out.print("Enter address");
	    String address = sc.nextLine();
	    
	    System.out.print("Enter City");
	    String city = sc.nextLine();
	    
	    System.out.print("Enter state");
	    String state = sc.nextLine();
	    
	    System.out.print("Enter zip");
	    int zip = sc.nextInt();
	    
	    System.out.print("Enter phone number");
	    Long Phno = sc.nextLong();
	    
	    System.out.print("Enter Email");
	    String email = sc.nextLine();
	    
	    
	}

}
