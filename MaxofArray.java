import java.util.Scanner;
// maximum of given array using scanner class
public class MaxofArray 

{    public static void main(String[] args) 
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
	        int max = arr[0];  
	       
	        for (int i = 0; i < arr.length; i++) 
	        {  

	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max); 	
}  
}  


