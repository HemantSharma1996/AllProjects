package Inheritance;

public class HirarchicleInheritance
{
  public static void main(String[] args)
  {
	  Son1 s1=new Son1();
	  s1.car();
	  s1.money();
	  s1.home();
	  s1.mobile();
	  
	  System.out.println("------------------------");
	  
	  Son_2 s2=new Son_2();
	  s2.car();
	  s2.money();
	  s2.home();
	  s2.laptop();
	  
	  System.out.println("-------------------------");
	  
	  Son_3 s3=new Son_3();
	  s3.car();
	  s3.money();
	  s3.home();
	  s3.bike();
  }
}
