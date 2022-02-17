
public class EvenOddcopy 

{
public static void main (String[]args)
{
	int arr[]= {3,2,7,5,1,9,8,4,6};
	int count=0;
	for (int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
			++count;
	}

	int even[]=new int[count];
	int odd[]=new int[arr.length-count];
	int a=0,b=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even[a]=arr[i];
		
		}
		else
		{
			odd[b]=arr[i];
			++b;
			
		}
	}
	System.out.println("even arry elemnts");
	
	for(int i=0;i<even.length;i++)
	{
	System.out.println(even[i]);
	}
	for(int i=0;i<odd.length;i++)
	{
	System.out.println(odd[i]);
	}
}
}