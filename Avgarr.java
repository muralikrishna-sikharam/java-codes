import java.util.Scanner;

public class Avgarr 

{
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter n value:");
	int n=scan.nextInt();
	
	int src[]=new int[n];
	System.out.println("enter array values:");
	for(int i=0;i<n;i++)
	{
		src[i]=scan.nextInt();
	}
	int sum=0,count=0;
	
	for (int i=0;i<src.length;i++)
	{
		sum=sum+src[i];
		++count;
		
	}
	int avg=(sum/count);
	System.out.println("sum of arry values is"+sum);
	System.out.println("avg is"+avg);
	}
}
