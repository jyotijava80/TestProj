package IO;

import java.util.Scanner;

public class Scanner_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int number=scan.nextInt();
	    System.out.println("Enter first Name");
	    String name=scan.next();
	    System.out.println("entered number is--> "+ number + "   Name is --> "+ name);
	    

	}

}
