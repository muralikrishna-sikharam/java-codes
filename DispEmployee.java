import java.util.ArrayList;
import java.util.List;

public class DispEmployee 
{
	
	public static void main(String[] args) 
	{
		int id[]= {101,102,103,104,105,106};
		String name[]= {"amar","harin","sathya","annie","raji","vijji"};
		int salary[]= {30000,35000,40000,45000,42000,50000};
		int deptNum[]= {20,10,20,20,30,10};
		String location[]= {"hyderabad","chennai","banglore","hyderabad","pune","banglore"};
		
		List<Employee>list=new ArrayList<Employee>();
		for(int i=0;i<id.length;i++)
		{
			Employee obj =new Employee();
			obj.setId(id[i]);
			obj.setName(name[i]);
			obj.setSalary(salary[i]);
			obj.setDeptNum(deptNum[i]);
			obj.setLocation(location[i]);
			list.add(obj);
			
		}
		query1(list);
		query2(list);
		query3(list);
		query4(list);
		query5(list);
		query6(list);
		query7(list);
		query8(list);
		query9(list);
		query10(list);
	
	}
	static void query1(List<Employee>list)
	{ 
		System.out.println("All details");
		for(Employee obj:list)
		
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query2(List<Employee>list)
	{ 
		System.out.println("Employee details of id=105");
		for(Employee obj:list)
			if (obj.getId()==105)
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query3(List<Employee>list)
	{ System.out.println("employee details of location=hyderabad");
		for(Employee obj:list)
			if (obj.getLocation().equals("hyderabad"))
	
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query4(List<Employee>list)
	{ 
		System.out.println("Loc=bangalore DeptNum=20");
		for(Employee obj:list)
			if ((obj.getDeptNum()==20)&&(obj.getLocation().equals("bangolre")))
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query5(List<Employee>list)
	{ 
		System.out.println("Salary between 30k&40k");
		for(Employee obj:list)
			if ((obj.getSalary()>=30000)&&(obj.getSalary()<=40000))
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query6(List<Employee>list)
	{ System.out.println("id=102&105");
		for(Employee obj:list)
		if	((obj.getId()==102)||(obj.getId()==105))
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query7(List<Employee>list)
	{ 
		System.out.println("Reverse ");
		for(int i=list.size()-1;i>=0;i--)
			
	{ 
			Employee obj=list.get(i);
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
	}
	static void query8(List<Employee>list)
	{ 
		System.out.println("loc=hyderabad&salary>=35k");
		for(Employee obj:list)
	if( (obj.getLocation().equals("hyderabad"))&& (obj.getSalary()>=35000))
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());

		
	}	
}
	static void query9(List<Employee>list)
	{ System.out.println("!=hyd");
		for(Employee obj:list)
			if (!obj.getLocation().equals("hyderabad"))
	{ 
		System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());
	}

		
	}		
	static void query10(List<Employee>list)
	{ System.out.println("!=chennai&depyNum=10");
		for(Employee obj:list)
		{
		if (!obj.getLocation().equals("chennai")&&(obj.getDeptNum()==10))

			System.out.println(obj.getId()+","+obj.getName()+","+obj.getSalary()+","+obj.getDeptNum()+","+obj.getLocation());
				
        }
		
    }
	
}
