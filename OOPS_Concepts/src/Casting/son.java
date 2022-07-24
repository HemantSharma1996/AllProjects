package Casting;
 
//child/sub-class
public class son extends father
{
	public void bike()
	{
		System.out.println("bike:FZ v3");
	}
	public void car()
	{
		System.out.println("car:BMW");// override
	}
	
    public void money()
    {
    	System.out.println("money:1L");// override
    }
    
//     public void home()
//     {
//    	 System.out.println("home:2BHK");
//     }
  
}
