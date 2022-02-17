
public class Examarr
{
	public static void main(String[]args) {
		
	
	int a[]= {5,2,8,1,9,4,7,3};
	int i=0;
	int j=a.length-1;
	while(++i<--j)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}
	System.out.println(a[2]);
	System.out.println(a[5]);
}
	}
