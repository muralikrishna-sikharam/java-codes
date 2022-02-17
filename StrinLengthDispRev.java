import java.util.Scanner;

public class StrinLengthDispRev 
{

	public static void main(String[] args) 
	{
		// string length and reverse the string print the string
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scan.nextLine();
		
		System.out.println("length of string s is :"+s.length());
		char ch[]=s.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		String revstr="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revstr=revstr+ch[i];
		}
		System.out.println(revstr);
		
		if(s.equals(revstr))
		{
			System.out.println("given string is palindrome");
		}
		else 
		{
			System.out.println("given string is not a palindrome");
			
		}
			
		
	}

}
