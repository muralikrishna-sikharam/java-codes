// to find the min of array elements

import java.util.Scanner;

public class MinofArray
{
    static void min(int arr[])
    {
int min=arr[0];
    for(int i=1;i<arr.length;i++)
  
 if(min>arr[i])
  min=arr[i];

System.out.println("smallest value in array is"+min);
    
    }

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
	System.out.println("enter array values");
	a[i]=sc.nextInt();
}

min(a);//passing array to method

}
}
