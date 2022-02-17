import java.util.Scanner;

public class LinearSearcharr 
{
		//linear search
			
			public static void main(String[]args)
			{
				//read size of array
				Scanner scan=new Scanner(System.in);
				System.out.println("enter size:");
				int n =scan.nextInt();
				int arr[]=new int[n];
				boolean found=false;
				System.out.println("enter array values:");
				
				for (int i=0;i<n;i++)
				{
					arr[i]=scan.nextInt();
				}
				
				System.out.println("enter element to search:");
				int key=scan.nextInt();
				
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==key)
					{
						System.out.println("element at location"+i);
						found=true;
						break;
					}
				}
				if(!found)
				{
					System.out.println("not found");
				}
			}
}
