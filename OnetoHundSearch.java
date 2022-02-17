import java.util.Arrays;

public class OnetoHundSearch 
{
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) 
        {
            return n;
        }
  
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
  
        for (int i = 0; i < n - 1; i++) 
        {
            if (a[i] != a[i + 1]) 
            {
                temp[j++] = a[i];
            }
            else if (a[i]==a[i+1])
            		{
            	temp[j++]=0;
            	            	
            		}
            
        }
  
        temp[j++] = a[n - 1];
  
        // Changing the original array
        for (int i = 0; i < j; i++) 
        {
            a[i] = temp[i];
        }
  
        return j;
    	}
	
	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,5,6};
		
		int [] array = new int[100];    
		for (int a = 0; a < array.length; a++)
		{
		    array[a] = a + 1;
		     
		}
		
		int n1=arr.length;
		int n2=array.length;
		int n3=n1+n2;
		System.out.println("new array lenth"+n3);
		
		int res[]=new int[n3];
		
		for(int i=0;i<n1;i++)
		{
			res[i]=arr[i];
		}
		for(int i=0;i<n2;i++)
		{
			res[n1+i]=array[i];
		}
		for(int i=0;i<n3;i++)
		{
			System.out.print(res[i]+" ");
			
		}
		 Arrays.sort(res);
		  
	        // Printing the array after sorting
	        System.out.println("Modified arr[] :"+Arrays.toString(res));
	        for(int i=0;i<n3;i++)
			{
				System.out.print(res[i]+" ");
				
			}
		
		n3 = res.length;
		  
        n3 = removeduplicates(res, n3);
        System.out.println();
        // Printing The array elements
        for (int i = 0; i < n3; i++)
        	
            System.out.print(res[i] + " ");
  	
		  
	}

}
