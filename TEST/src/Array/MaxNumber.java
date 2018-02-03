package Array;

public class MaxNumber {
	
	
	
	public static void main(String args[])
	{
		int arr1[]={1,5,4,67,409,3};
		int temp=0;
		for(int i=0;i<arr1.length;i++)
		{
			
			if (arr1[i] > temp)
			{
				temp = arr1[i];
			}
			
		}
		System.out.println("maximum number in the array is-->"+temp);
		
		
		
	}
	

}
