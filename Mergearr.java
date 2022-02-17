
public class Mergearr {

	public static void main(String[] args) 
	{
		//merge arrays
		
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		int m=a.length;
		int n=b.length;
		int c[]=new int[m+n];
		for(int i=0;i<m;i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0;i<n;i++)
		{
			c[m+i]=b[i];
			
		}
		for (int i=0;i<m+n;i++)
		{
			System.out.println(c[i]);
		}

}
}
