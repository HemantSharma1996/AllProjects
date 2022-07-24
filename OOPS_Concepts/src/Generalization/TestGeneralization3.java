package Generalization;

public class TestGeneralization3 
{
	public static void main(String[] args)
	  {
		 System.out.println("---------JIO SIMCARD------");
	     
		Jio3 j=new Jio3();
		j.sms();
		j.audiocalling();
		j.internet();
		j.newFeatureA();
		
		System.out.println("----------VI SIMCARD--------");
		
		  VI3 v=new VI3();
	      v.sms();
	      v.audiocalling();
	      v.internet();
	      v.newFeatureB();
	      
	    System.out.println("----------airtel------------");
		
	     airtel3 a=new airtel3();
	     a.sms();
	     a.audiocalling();
	     a.internet();
	     a.newFeatureC();

}}
