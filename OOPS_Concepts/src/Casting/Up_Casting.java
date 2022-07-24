package Casting;

public class Up_Casting
{
public static void main(String[] args)
{
	father d  = new son();  // create object of subclass with reference of superclass-->upcasting
	d.car();
	d.money();
	d.home();
}
}
