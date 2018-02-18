
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starting the program");
		System.out.println("do some stuff");
		Test test1 =new Test();
		Test test2 = new Test();
		test2.setModel("Maruthi");
		test2.setOwner("kdkdk");
		
		
		System.out.println("Test2 Model name>>"+ test2.getModel());
		System.out.println("Test2 Owner name>>"+ test2.getOwner());
	/*	test1.Model= "Maruthi";
		test1.Owner = "Jyoti";*/
		
		/*test2.Model= "ABC";
		test2.Owner = "Rages";*/
		
	
		
		System.out.println("Class name-->" +test1.getClass());
		//System.out.println(test1.getNumber());
		
		
		System.out.println("fininshing with it");

		
		 String a = "hello";
		 System.out.println(a.concat("hi"));
		 System.out.println(a);
		 String t = a.concat("hi");
		 System.out.println(t);
		 
	}

}
