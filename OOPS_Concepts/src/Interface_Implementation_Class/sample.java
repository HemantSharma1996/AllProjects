package Interface_Implementation_Class;

public class sample implements I1,I2
{
   public void m5()
   {
   System.out.println("method m5 from interface I2 completed in IC");
   }

  public void m6()
  {
	  System.out.println("method m6 from interface I2 completed in IC");
  }
  
  public void m3()
  {
	  System.out.println("method m3 from interface I1 completed in IC");
  }
   public void m4()
   {
	   System.out.println("method m4 from interface I1 completed in IC");
   }
}