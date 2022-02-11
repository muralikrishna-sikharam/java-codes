import java.util.Scanner;

class AsciiValsinStr
{
    public static void main (String [] args)
    {
        // to display charter at given index 
      
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a String:");
        String s=scan.nextLine();

        for(int i=0;i<=s.length()-1;i++)
        {
            char x=s.charAt(i);
            System.out.println(x +" Ascii value is "+(int)x);
        }
        
       scan.close();
    }
}