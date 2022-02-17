import java.util.Scanner;

public class SortingArr {

	public static void main(String[] args) 
	{
		//sorting array in order
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter no of elments to enter in array");
		int n=scan.nextInt();
		
		int arr[]= new int[n];
		System.out.println("enter arrya values");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
				int temp;
				for (int i=0;i<arr.length-1;i++)
				{
					for(int j=0;j<(arr.length-1-i);j++)
					{
						if(arr[j]>arr[j+1])
						{
							temp =arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
							
						}
					}
				}
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+"  ");
				}
			
	}

}
