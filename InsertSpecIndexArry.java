import java.util.Scanner;

public class InsertSpecIndexArry {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50};
		int element=55;
		int position =3;
		int key[]=new int[arr.length+1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<position)
			{
				key[i]=arr[i];
			}
			else if(i==position)
			{
				key[position]=element;
			}
			else
			{
				key[i]=arr[i-1];
			}
		}
		
		for (int i=0;i<arr.length+1;i++)
		{
		System.out.println(key[i]);
		}
	}

}
