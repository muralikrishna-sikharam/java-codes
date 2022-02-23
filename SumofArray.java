import java.util.Scanner;

public class SumofArray 

{//sum of array elements

	    public static void main(String[] args) 
	    {  
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter n value of array:");
	        int n=scan.nextInt();
	        System.out.println("Enter "+n+"array elements:");
	        
	        int [] arr = new int [n];  
	        for(int i=0;i<arr.length;i++)
	        {
	        	arr[i]=scan.nextInt();
	        }
	        int sum = 0;  
	      
	        for (int i = 0; i < arr.length; i++) 
	        {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	    }  
	}  

