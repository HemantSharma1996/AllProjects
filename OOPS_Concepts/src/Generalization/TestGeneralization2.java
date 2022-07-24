package Generalization;

public class TestGeneralization2 
{
 public static void main(String[] args)
 {
	System.out.println("---------Jio simcard-------");
    
	Jio2 j=new Jio2();
	j.sms();
	j.audiocalling();
	j.internet();
	j.newFeatureA();
	
	System.out.println("---------VI simcard----------");
    
	VI2 v=new VI2();
	v.sms();
	v.audiocalling();
	v.internet();
	v.newFeatureB();
	
	System.out.println("---------airtel simcard--------");
    
	airtel2 a=new airtel2();
    a.sms();
    a.audiocalling();
    a.internet();
    a.newFeatureC();
 
 }
}
