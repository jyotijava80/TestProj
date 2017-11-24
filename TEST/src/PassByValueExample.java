
public class PassByValueExample {
	
	int data = 50;
	
	public int change(int data)
	{
		data = data+500;
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValueExample pby = new PassByValueExample();
		System.out.println("before passing: value of data --> "+ pby.data);
	    pby.change(500);
	    System.out.println("after passing: value of data --> "+ pby.data);
	    
	    //Another example with reference type:
	    
	   
	}

}
