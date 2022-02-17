
public class StrinBasicOperations {

	public static void main(String[] args) 
	{
		// to do concat and equals
		// difference between == and .equals
		 String str2="murali";
		 String str1="murali";
		 if(str1.equals(str2))
		 {

				System.out.println("both strings are equals");  
			 
		 }
		 String s3=str1.concat(str2);
		 String s4=new String("murai");

			System.out.println("string after concatination is:::"+s3);  

			System.out.println(str1.equals(str2)); //true 
			System.out.println(str1==str2);  //true
			System.out.println(str1.equals(s4)); //true
			System.out.println(str1==s4);  //different locations stored and mapped false
		

			System.out.println(str1.compareTo(str2));  

			System.out.println(str1.compareTo(s4));  
		
		
		
		 }

}
