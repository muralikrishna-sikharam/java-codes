class Upper_Lower_Str
{
    public static void main (String [] args)
    {
        String s="this is murali krishna";
        char[]ch=s.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            int arr[]=new int[ch.length];
            arr[i]=(int)ch[i];
            if(arr[i]>=97 && arr[i]<=122)
            {
                arr[i]=arr[i]-32;
                System.out.print((char)arr[i]);
            }
        }

    }
}