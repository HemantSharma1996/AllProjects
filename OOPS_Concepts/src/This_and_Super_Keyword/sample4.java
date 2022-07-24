package This_and_Super_Keyword;

public class sample4 extends sample5 
{
   //int a=30;// global variable from super class
	
	int a=20;
	public void m1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args)
	{
		sample4 s4=new sample4();
		s4.m1();
	}
}
