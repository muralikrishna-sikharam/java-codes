import java.util.Scanner;

class SplittingStr
{
    public static void main (String [] args)
    {
       String s="this is cat with me her name is murali";
       String arr[]=s.split(" ");
       System.out.println("word count is "+arr.length);
       System.out.println("words");
       for(String e:arr)
       {
           System.out.println(e);
        } 
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}