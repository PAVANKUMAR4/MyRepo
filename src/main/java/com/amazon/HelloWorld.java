package com.amazon;

/**
 * Hello world!
 *
 */
public class HelloWorld
{
	int a,b,c;
	public HelloWorld()
	{
		a=10;
		b=20;
	}
	public int add()
	{
		System.out.println("I am from add method");
		c=a+b;
		System.out.println("Sum of two values is:"+c);
		return c;
	}
    public static void main(String args[])
	{
    	HelloWorld obj = new HelloWorld();
    	System.out.println(obj.add());
    	//System.out.println(obj.c);
		System.out.println("Inside Main block");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello Jenkins:---------" +i);
			
		}
		System.out.println("Outside Main block");
	    System.out.println("Exited from Program");
	    System.out.println("///////////////////////////");	    
	}
}