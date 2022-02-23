import java.util.Scanner;

public class OddsumEvensumArray 
{
	//odd sum even sum of elements in array
		public static void main(String args[])
		
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
		        int oddsum=0,evensum=0;
		
		for(int i=0;i<arr.length;i++)
		{  
		if(arr[i]%2!=0)
		{  
		System.out.println("Odd Number at: "+i+ " location");  
		System.out.println(arr[i]);  
		oddsum=oddsum+arr[i];
		}  
		}  
		System.out.println("odd sum of array elements is :"+oddsum);
		for(int i=0;i<arr.length;i++)
		{  
		if(arr[i]%2==0)
		{  
		System.out.println("even Number at: " +i+ " location");  	
		System.out.println(arr[i]);  
		evensum=evensum+arr[i];
		}  
		}  
		System.out.println("even sum of array elements is :"+evensum);
		}
}  
	

