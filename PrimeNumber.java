import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter any n number:");
		int n = scan.nextInt();
		int count=0;
		
		for (int i=1;i<=n ; i++)
		{
			if(n%i==0)
			{
				++count;
			}
		}
		if (count==2)
					System.out.println("number is prime.");
			
		
		else 
		{
			System.out.println("number is not a prime");
		}
		}
	}


