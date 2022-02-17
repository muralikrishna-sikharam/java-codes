
import java.util.*;
public class ArrListEmploye2
{
	public static void main(String[] args) 
	{
		int id[]= {101,102,103,104,105};
		String name[]= {"murali","abhi","teja","salman","krishna"};
		double salary[]= {1000,2000,3000,4000,5000,6000};
		
		List<ArrLisEmploye>li=new ArrayList<ArrLisEmploye>();
		for(int i=0;i<id.length;i++)
		{
			ArrLisEmploye obj =new ArrLisEmploye();
			obj.setId(id[i]);
			obj.setName(name[i]);
			obj.setSalary(salary[i]);
			li.add(obj);
			
		}
		System.out.println("entered details are:");
		for(ArrLisEmploye obj:li)
		{
			System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary());
		}
	}
		

}

