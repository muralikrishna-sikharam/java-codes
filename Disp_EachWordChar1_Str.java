//display char at 1 place in each word
class First_Char_Str
{
    public static void main (String [] args)
    {
        String s="this is murali krishna";
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i==0)
            System.out.println(ch);
            else if (ch==' ')
            System.out.println(s.charAt(i+1));
        }
        }

    }