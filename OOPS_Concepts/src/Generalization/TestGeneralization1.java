package Generalization;

public class TestGeneralization1
{
  public static void main(String[] args)
  {
	 System.out.println("------- Jio simcard------");
     
	 Jio1 j=new Jio1();
	 j.sms();
	 j.audiocalling();
	 j.internet();
	 j.newFeatureA();
	 
	 System.out.println("--------VI simcard--------");
     
	 VI1 v=new VI1();
	 v.sms();
	 v.audiocalling();
	 v.internet();
	 v.newFeatureB();
	 
	 System.out.println("--------- airtel simcard-----");
     
	 airtel1 a =new airtel1();
	 a.sms();
	 a.audiocalling();
	 a.internet();
     a.newFeatureC();
  }
}
