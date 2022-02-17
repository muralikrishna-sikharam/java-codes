public class ArrLeftevenRihtOdd 
{

	public static void main(String[] args) 
	{
	//first even from left first odd from right and swap them
		
		int a[]= {10,20,1,11,13,14};
		
		int i=0;int j=a.length-1;
		
		while(true)
		{
			if(a[i]%2==0)
			{
				break;
			}
			i++;
		}
		
		while(true)
		{
			if(a[j]%2!=0)
			{
				break;
			}
			j--;
		}
	
	    int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	
		for(int x=0;x<a.length;x++)
		{
		System.out.print(a[x]+",");
		}		
			
}
}

