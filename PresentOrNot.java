
public class PresentOrNot 
{

	public static void main(String[] args) 
	{
				//read size of array
				
				int arr[]= {10,20,35,30,45,55,65};
				int key1=35;
				int key2=55;
				boolean found=false;
				/*System.out.println("enter size:");
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
				*/
				
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==key1)
					{
						System.out.println("element at location"+i);
						found=true;
						
					}
					else if(arr[i]==key2)
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


