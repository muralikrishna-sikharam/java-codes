
public class EvenOddSum 
{
public static void main(String []args)
{
	int arr[]= {1,2,3,4,5,4,6,8,9};
	int evensum=0;
	int oddsum=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			evensum=evensum+arr[i];
			
		}
		else
		{
			oddsum=oddsum+arr[i];
		}
	}
	System.out.println("even sum:"+evensum);
	System.out.println("odd sum"+oddsum);
}

	
}
