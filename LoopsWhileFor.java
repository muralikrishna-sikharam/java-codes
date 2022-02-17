
public class LoopsWhileFor {

	public static void main(String[] args) 
	{
		/*int s=0;
		for (int i=1;i<=5;++i)
		{
			System.out.println(s+=i);1,3,6,10,15
		}
		int i=2;
		while(i+3<=9)
		{
			System.out.println(++i);
			
		}*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<j) 
				{

					System.out.print(i+j);
				}
				
			}
		}
		
	}

}
