package IO;

import java.io.Console;
import java.util.Scanner;

public class ConsoleDemo {
   public static void main(String[] args) {
      
	   Scanner sc=new Scanner(System.in);  
	     
	   System.out.println("Enter your rollno");  
	   int rollno=sc.nextInt();  
	   System.out.println("Enter your name");  
	   String name=sc.next();  
	   System.out.println("Enter your fee");  
	   double fee=sc.nextDouble();  
	   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
	   sc.close();  
   }
}