import java.util.Scanner;

public class AvgofallexcSmallBig {

	public static void main(String[] args) 
	{
	
	//avg of all elements excluding big and small;		
			{
				//read size of array
				Scanner scan=new Scanner(System.in);
				System.out.println("enter size:");
				int n =scan.nextInt();
				int arr[]=new int[n];
				
				System.out.println("enter array values:");
				
				for (int i=0;i<n;i++)
				{
					arr[i]=scan.nextInt();
				}
				
				int big=arr[0];
				int small=arr[0];
				double total,sum=0,avg;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]>big)
					{
						big=arr[i];
					}
					if(arr[i]<small)
					{
						small=arr[i];
					}
					sum=sum+arr[i];
						
				}
				total=sum-small-big;
				avg=total/(arr.length-2);
			System.out.println(avg);
				
		}

	}

}
