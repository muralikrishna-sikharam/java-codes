
import java.util.*;

class ArrlistStudent1 
{
public static void main(String[]args) 
	{
				int id[]= {101,102,103,104,105};
				String name[]= {"murali","abhi","teja","salman","krishna"};
				String course[]= {"java","net","spring","java","springboot","angular"};
				
				List<ArrListStudent>list=new ArrayList<ArrListStudent>();
				for(int i=0;i<id.length;i++)
				{
					ArrListStudent obj =new ArrListStudent();
					obj.setId(id[i]);
					obj.setName(name[i]);
					obj.setCourse(course[i]);
					list.add(obj);
					
				}
				System.out.println("entered details are:");
				for(ArrListStudent obj:list)
				{
					System.out.println(obj.getId()+","+obj.getName()+","+obj.getCourse());
				}
			}
				

	}


