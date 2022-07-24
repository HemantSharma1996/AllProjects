package Generalization;

public class TestGeneralisation4 
{
  public static void main(String[] args)
  {
	  System.out.println("---------JIO SIMCARD DETAILS-----------");
	  Jio4 j=new Jio4();
	  j.sms(); 
	  j.audiocalling();
	  j.videocalling();
	  j.newfeatureA();
	  
	  System.out.println("-------------- VI CARD DETAILS----------");
	  VI4 v= new VI4();
	  v.sms();
	  v.audiocalling();
	  v.videocalling();
	  v.newfeatureB();
	  
	  System.out.println("-------------- AIRTEL CARD DETAILS--------");
	  airtel4 a=new airtel4();
	  a.sms();
	  a.audiocalling();
	  a.videocalling();
	  a.newfeatureC();
}
}
