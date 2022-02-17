
public class SizeplusLargestarr 
{

	public static void main(String[] args) 
	{
		//input array 0/p 19,21,23,25,20,26,18,22 
		//array elements =size of array+bigest element in array
		
		int a[]= {2,4,6,8,3,9,1,5};
		int l=a.length;
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=big+l+a[i];
			System.out.print(a[i]+" ");
		}

}
}
