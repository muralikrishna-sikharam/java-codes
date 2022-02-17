
public class Sumof1neglastposarry {

	public static void main(String[] args) 
	{
	int arr[]= {3,5,6,-2,-5,7,3,-4,6,-1,9,-8,-3};
	
	//to find the sum of two elements that 1st negative value from left and postive from right
	int i=0;
	while(true)
	{
		if(arr[i]<0)
		{
			break;
		}
		i++;
	}
	int j=arr.length-1;
	while(true)
	{
		if(arr[j]>0)
		{
			break;
		}
		j--;
	}

	System.out.println(arr[i]+arr[j]);

	
	}

}
