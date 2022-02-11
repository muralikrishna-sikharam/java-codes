

class NoofWords_Str
{
    public static void main (String [] args)
    {
       String s="this is cat with me her name is murali";
        
       int count=0;
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch==' ')
           {
               count++;
           }

       }
       System.out.println("word count is "+ (count+1));
    }
}