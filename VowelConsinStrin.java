import java.util.*;
public class VowelConsinStrin 
{
//ccheck the ggiven string is palindrome or not 
	//and concating the string in last two lines
	
	  public static boolean Palindrome(String a)
	  {
	    if(a.length() == 0 || a.length() == 1)
	    {
	      return true;
	    } 
	    if(a.charAt(0) == a.charAt(a.length()-1))
	    {
	      return Palindrome(a.substring(1, a.length()-1));
	    }
	      return false;
	  }
	  
	  public static void main(String[]args)
	  {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String string = inp.nextLine();
	    if(Palindrome(string))
	    {
	      System.out.println(string + " is a palindrome");
	    }
	    else
	    {
	      System.out.println(string + " is not a palindrome");
	    }   
	    string=string.concat("murali");//concatinating two strings
	    System.out.println(string);//displaying the string string
	    
	    String string2="murali";
	    String string3="murali";
	  }
	
	
	
	}


