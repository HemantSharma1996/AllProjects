package Generalization;

public class Test_Generalisation 
{
public static void main(String[] args)
{
	System.out.println("---------Saving Account Details-----------");
	
	Saving_Acc s=new Saving_Acc();
	s.CD();
	s.CW();
    s.MT();
    s.newfeatureA();
    
    System.out.println("---------Current Account Details----------");
    
    Current_Acc c=new Current_Acc();
    c.CD();
    c.CW();
    c.MT();
    c.newfeatureB();
    
    System.out.println("----------Salary Account Details-----------");
    
    Sal_Acc sa=new Sal_Acc();
    sa.CD();
    sa.CW();
    sa.MT();
    sa.newfeatureC();
    
}
}
