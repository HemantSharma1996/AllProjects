package This_and_Super_Keyword;

public class sample3
{
   int c=50;
   
   public void m3()
   {
	   int c=40;
	   System.out.println(c);
	   
	   System.out.println(this.c);
	   }
   
   public static void main(String[] args)
   {
	   sample3 s3=new sample3();
	   s3.m3();
   }
}
