import java.util.Scanner;

public class RemoveDuplicateOfArray 
{
	
		public static int removeDuplicateElements(int arr[], int n)
		{  
		        if (n==0 || n==1)
		         //if array length is 0 or 1 return same
		            return n;  
		        
		       
		        int[] temp = new int[n];  
		        int j = 0;  
		        for (int i=0; i<n-1; i++)
		        {  
		            if (arr[i] != arr[i+1])
		            {  
		                temp[j++] = arr[i];  
		            }  
		         }  
		        temp[j++] = arr[n-1];     
		        // Changing original array  
		        for (int i=0; i<j; i++)
		        {  
		            arr[i] = temp[i];  
		        }  
		        return j;  
		 }  
		       
		    public static void main (String[] args) 
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
		         System.out.println("array elements are:");
		         for (int x:arr)
		         System.out.print(" "+arr[x]);
		         
		        int length = arr.length;  
		        length = removeDuplicateElements(arr, length);  
		        //printing array elements  
		        System.out.println("Array elements after removal of duplicates: ");
		        for (int i=0; i<length; i++)  
		           System.out.print(" "+arr[i]+" ");  
		    }  
		}  


