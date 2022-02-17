import java.util.Scanner;

public class RevrsalNumber 
{

		public static void main(String[] args) 
		{
			Scanner scan= new Scanner(System.in);
			System.out.println("enter any n number:");
			int n = scan.nextInt();
			
			int sum=0;
			int d;
			while(n!=0)
			{
				d=n%10;
				sum=(sum*10)+d;
				n=n/10;
			}
			
				System.out.println(sum);
		}

}



