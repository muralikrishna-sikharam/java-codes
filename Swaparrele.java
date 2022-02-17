import java.util.Scanner;

public class Swaparrele
{
	public static void main (String[]args)
	{//swap elements in array
		int arr[]= {2,5,1,8,9,6,4};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the i value");
		int i=scan.nextInt();
		System.out.println("enter the j value");
		int j=scan.nextInt();
		
			if(i==j)
			{
				System.out.println("no swapping required");
			}
			else if ((i<0 && i>=arr.length)||(j<0 && j>=arr.length))
			{
				System.out.println("invalid locations");
			}
			else
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				System.out.println(arr[i]);
				System.out.println(arr[j]);
			}
	}
		
}


