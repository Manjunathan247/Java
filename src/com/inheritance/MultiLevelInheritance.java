package com.inheritance;

class Base
{
	public void base()
	{
		System.out.println("Base");
	}
}

class SubA extends Base
{
	public void subA()
	{
		System.out.println("SubA");
	}
}

class SubB extends SubA
{
	public void subB()
	{
		System.out.println("SubB");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		SubB b = new SubB();
		b.base();
		b.subA();
		b.subB();
	}

}
