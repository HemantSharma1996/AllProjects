package Access_Specifier;
//Private
public class demo1
{
  private static int a=10;
  private int b=20;
      
   private demo1()
  {
	  
  }
   
   private static void m1()
   {
	   System.out.println(a);
   }
   
   private void m2()
   {
	   System.out.println(b);
	   
   }
   
   public static void main(String[] args)
   {
	   m1();
	 demo1 d1=new demo1();
	 d1.m2();
   }
}
