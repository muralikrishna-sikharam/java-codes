import java.util.*;

public class ArrListEmployee1 
{

		public static void main(String[] args) 
		{
			int id[]= {101,102,103,104,105};
			String name[]= {"murali","abhi","teja","salman","krishna"};
			double salary[]= {1000,2000,3000,4000,5000,6000};
			
			List<Employee>li=new ArrayList<Employee>();
			for(int i=0;i<id.length;i++)
			{
				Employee obj =new Employee(id[i],name[i],salary[i]);
				li.add(obj);
				
			}
			System.out.println("entered details are:");
			for(Employee obj:li)
			{
				System.out.println(obj.id+","+obj.name+","+obj.salary);
			}
		}
			

	}

