import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter any n number:");
		int n = scan.nextInt();
		
		int rev=0;
		int d;
		int temp=n;
		while(n!=0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("palindrome");
			else
				System.out.println("not a palindrome");
	}

}
