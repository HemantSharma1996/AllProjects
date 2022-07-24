package This_and_Super_Keyword;

public class sample1 
{
 int b=30;
 
 public void m1()
 {
	 int b=20;
	 System.out.println(b);
	 
	 System.out.println(this.b);
 }
 
 public static void main(String[] args)
 {
	 sample1 s1=new sample1();
	 s1.m1();
 }
}
