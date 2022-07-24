package Generalization;

public class TestGeneralization
{
 public static void main(String[] args)
{
	 System.out.println("-----Features of Jio SimCard-------");
     
	 Jio j=new Jio();
	 j.sms();
	 j.audiocalling();
	 j.internet();
	 j.newFeatureA();
    
	 System.out.println("-----Features of VI SimCard------------");
	 
	 VI v=new VI();
	 v.sms();
	 v.audiocalling();
	 v.internet();
	 v.newFeatureB();
	 
	 System.out.println("------Features of airtel SimCard--------");
     
	 airtel a=new airtel();
	 a.sms();
	 a.audiocalling();
	 a.internet();
	 a.newFeatureC();

}
}
