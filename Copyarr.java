
public class Copyarr 
{
	public static void main(String[]args)
	{
		int src[]= {10,20,30,30,40,50};
		int dest[]=new int[src.length];
		
		for (int i=0;i<src.length;i++)
		{
			dest[i]=src[i];
			
		}
		for (int j=0; j<dest.length;j++)
		{
			System.out.println("array element"+ "is"+dest[j]);
		}
		
	}
	

}
