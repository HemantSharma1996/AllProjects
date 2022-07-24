package Static;

public class looping_Nested_if 
{
  public static void main(String[] args)
  {  
	   int age=20;
	   int weight=50;
	  if(age>=18)
	  {
		  System.out.println("age>=18");
	    
	  if(weight>=55)
	  {
		  System.out.println("you are eligible for blood donation");
	  }
	  else
	  {
		  System.out.println("you are not eligible for blood donation :weight<55");
	  }
	  }
	  
	  else
	  {
		  System.out.println("you are not eligible for blood donation");
	  }
  }
}
