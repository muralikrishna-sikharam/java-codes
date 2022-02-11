import java.util.Scanner;

class UpperLowerDigit
{
    public static void main (String [] args)
    {
        // to display charter upper lower digit
      
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a character");
        char s=scan.nextLine().charAt(0);
        if(s>='a' && s<='z')
        {
            System.out.println(s+"is lower case.");
        }
        else if(s>='A' && s<='Z') 
        {
            System.out.println(s+"is upper case.");
        } 
        else if(s>='0' && s<='9') 
        {
            System.out.println(s+"is Digit.");
        }
        else
        {
            System.out.println(s+"is symbol");
        }
        
    }
}


