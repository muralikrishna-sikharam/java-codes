
public class GreatavgNumDis {

	public static void main(String[] args) 
	{
		//display no greater then avg
		
		int a[]= {60,10,20,30,40,50,40,50,60};
		int sum=0,avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		
	for (int i=0;i<a.length;i++)
	{
		if(a[i]>avg)
		{
			System.out.println(i+"element greater than avg "+avg+ "is");
			System.out.println(a[i]);
			
		}
	}
	}

}
