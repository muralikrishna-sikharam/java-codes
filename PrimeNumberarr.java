
public class PrimeNumberarr {

	public static void main(String[] args) 
	{
	//prime number not executed
		
		int arr[]= {3,4,5,6,7,8,9};
		int count=0;
		for(int x=0;x<arr.length;x++)
		{
		int n=arr[x];
		
		for (int i=1;i<=n ; i++)
		{
			
			if(n%i==0)
			{
				++count;
			}
		}
		if (count==2)
		{
			System.out.println("number is prime.");
		}	
		
		}
}

}
