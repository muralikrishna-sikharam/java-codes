import java.util.Scanner;

public class PerfectOrNot 
{
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter any n number:");
		int n = scan.nextInt();
		int sum=0;
		
		for (int i=1;(i<=n)&&(i<=n/2); i++)
		{
			if(n%i==0)
			{
			sum=sum+i;
			}
		}
		if (n==sum)
					System.out.println("perfect");
			
		
		else 
		{
			System.out.println("number not perfect");
		}
		}
	}


