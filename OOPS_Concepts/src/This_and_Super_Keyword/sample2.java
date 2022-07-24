package This_and_Super_Keyword;

public class sample2
{
       int a=20;
       public void m2()
       {
    	   int a=10;
    	   System.out.println(a);
    	   
    	   System.out.println(this.a);
       }
        public static void main(String[] args) {
        	
        	sample2 s2=new sample2();
        	s2.m2();
        }
       }
