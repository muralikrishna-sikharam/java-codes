import java.util.Scanner;

class UpperLowerDigit
{
    public static void main (String [] args)
    {
        // to display charter upper lower lower to upper not executed
      
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a character");
        char c=scan.nextLine().charAt(0);

        if(c>='a' && c<='z')
        {
            
            int y =(int)c;
            c=(char) (y-32);
            System.out.println(c);

        }
        else if(c>='A' && c<='Z') 
        { 
        int x= (int)c;
         c=(char)(x+32);
                System.out.println(c);
           
        } 
    }
}