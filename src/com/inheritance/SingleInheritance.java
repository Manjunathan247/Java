package com.inheritance;

class BaseClass{
	public String name = "Manju";
	public void methodBaseA()
	{
		System.out.println("methodBaseA");
	}
	public void methodBaseB()
	{
		System.out.println("methodBaseB");
	}
}

class SubClass extends BaseClass
{
	public void methodSubClass()
	{
		System.out.println("methodSubClass");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		SubClass s = new SubClass();
		System.out.println(b.name);
		b.methodBaseA();
		b.methodBaseB();
		s.methodBaseA();
		s.methodBaseB();
		s.methodSubClass();

	}

}
