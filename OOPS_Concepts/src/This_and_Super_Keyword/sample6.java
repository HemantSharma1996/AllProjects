package This_and_Super_Keyword;

public class sample6 extends sample7
{
// int b=50;
	
	int b=40;
	
	public void m6()
	{
		int b=30;
		System.out.println(b);
		
		System.out.println(this.b);
		
		System.out.println(super.b);
	}
	
	public static void main(String[] args)
	{
		sample6 s6=new sample6();
		s6.m6();
	}
}
