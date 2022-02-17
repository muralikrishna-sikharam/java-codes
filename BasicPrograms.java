import java.util.Scanner;

public class BasicPrograms {

	public static void main(String[] args) 
	{
		int i,n,sum=0,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n any value:");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			sum=sum+i;
			fact=fact*i;
			if(i%2==0)
			{//even numbers below n
				System.out.print(i+"  ");
			}
		}	

		System.out.println();
		System.out.println("number divisible by 3 or 5 below "+n);
		for(i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				System.out.print(i+"  ");
			}
		}

		System.out.println();
		System.out.println("number divisible by 3 below "+n);
		for(i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		System.out.println("factors of "+n);
		int count = 0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+"  ");
				count++;
			}
		}
		System.out.println();
		if(count==2)
		{
System.out.println(n+"is prime");
		}
		else
			System.out.println(n+"is not prime");
		
		System.out.println();
		int avg=sum/n;
		System.out.println("Sum is:"+sum);
		System.out.println("Avg is:"+avg);
		System.out.println(n+"factorial is"+fact);
	}

}
