
public class SwapRevarr {

	public static void main(String[] args) 
	{
		//swap the array in reverse order 
		
	int arr[]= {10,20,30,40,50};
	int n=arr.length;
	int i=0;
	int j=n-1;
	while(i<j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
		for(int b=0;b<arr.length;b++)
		{
		System.out.println(arr[b]);
		}
	

}}
