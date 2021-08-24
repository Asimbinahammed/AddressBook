package bridgelabz;
import java.util.Scanner;

public class AddressBookSystem {
	
	/*
	 * UC1
	 * scanning details from user
	 */
	public static void main(String[] args) {
		Scanner sdc = new Scanner(System.in);
	    System.out.print("Enter firstname");
	    String fname = sdc.nextLine();
	    
	    Scanner sdcq = new Scanner(System.in);
	    System.out.print("Enter Last name");
	    String lname = sdcq.nextLine();
	    
	    Scanner sdcz = new Scanner(System.in);
	    System.out.print("Enter address");
	    String address = sdcz.nextLine();
	    
	    Scanner sdcx = new Scanner(System.in);
	    System.out.print("Enter City");
	    String city = sdcx.nextLine();
	    
	    Scanner sdcc = new Scanner(System.in);
	    System.out.print("Enter state");
	    String state = sdcc.nextLine();
	    
	    Scanner sdcv = new Scanner(System.in);
	    System.out.print("Enter zip");
	    String zip = sdcv.nextLine();
	    
	    Scanner sdcb = new Scanner(System.in);
	    System.out.print("Enter phone number");
	    String Phno = sdcb.nextLine();
	    
	    Scanner sdnc = new Scanner(System.in);
	    System.out.print("Enter Email");
	    String email = sdnc.nextLine();
	}

}
