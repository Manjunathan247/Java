package com.casting;

class DemoA
{
	public String name = "Manju";
	public void methodDemo()
	{
		System.out.println("Class - A");
	}
}

class DemoB extends DemoA
{
	public void methodDemo()
	{
		System.out.println("Class - B");
	}
}
public class DownCasting {

	public static void main(String[] args) {
		DemoA a = new DemoB(); // Upcasting
		System.out.println(a.name); //Manju	
		a.methodDemo(); //Class - B
		DemoB b = (DemoB) new DemoB(); //
		b.methodDemo(); //Class-B
	}

}
