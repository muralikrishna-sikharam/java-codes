import java.util.Scanner;

class StrtoChrArr_Indexele
{
    public static void main (String [] args)
    {
        // to display charter at given index 
        String s1="murali";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter index between 0 and "+(s1.length()-1)+"of element:");
        int n=scan.nextInt();
        if(n>=0 && n<=s1.length())
        {
            char x =s1.charAt(n);
            System.out.println("character at index "+n+" is "+x);
        }
        else
        {
            System.out.println("Outof Bound");
        }
       scan.close();
    }
}