public class SepEvenOdd 
{
	public static void main(String[] args) 
	{	//reflect and store the elements -ve in neg arry +ve in positive array
		//store in different array and display
		int arr[]= {1,-11,2,3,4,-12,-13};
		int nc=0,pc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			++nc;
			else
			++pc;
		}
		System.out.println("positive no count"+pc);
		System.out.println("negative no count"+nc);
		
		int negarr[] = new int[nc];
		int posarr[] = new int[pc];
		int a=0;
		int b=0;
		
		for(int x=0;x<=arr.length-1;x++)
		{
			if (arr[x]>=0)
			{
				posarr[a]=arr[x];
				++a;
			}
			else if(arr[x]<0)
			{
				negarr[b]=arr[x];
				++b;
			}
		}
		for(int y=0;y<pc;y++)
		{
			System.out.println(posarr[y]+"");
		}
		for(int z=0;z<nc;z++)
		{
			System.out.print(negarr[z]);
		}
	}
}