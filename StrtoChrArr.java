class StrtoChrArr
{
    public static void main (String [] args)
    {
        String s1="murali";
        char[]ch=s1.toCharArray();
        System.out.println("char arry length"+ch.length);
        for(char x:ch)
        {
            System.out.println(x+",");
        }
    }
}