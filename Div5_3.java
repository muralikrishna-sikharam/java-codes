import java.util.Scanner;

public class Div5_3 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter any n number:");
		int n = scan.nextInt();
		
		int count=0;
				
		for (int i=1;i<=n;i++)
			
			if ((i%3==0) && (i%5==0))
			{
				++count;
			}
			System.out.println("count is "+count);
		
	}

}
