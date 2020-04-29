package com.casting;

class A
{
	public String name = "Manju";
	public void methodDemo()
	{
		System.out.println("Class - A");
	}
}

class B extends A
{
	public void methodDemo()
	{
		System.out.println("Class - B");
	}
}
public class UpCasting {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.name); //Manju
		a.methodDemo(); //Class - A
		B b = new B();
		System.out.println(b.name); //Manju
		b.methodDemo(); // Class - B
		
		A up = new B();
		System.out.println(up.name); //Manju
		up.methodDemo(); // Class -B
	}

}
