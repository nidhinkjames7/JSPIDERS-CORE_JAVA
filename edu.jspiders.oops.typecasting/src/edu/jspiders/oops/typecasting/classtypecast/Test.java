package edu.jspiders.oops.typecasting.classtypecast;

public class Test 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Parent();
		Child c= new Child();
		
		System.out.println(p1.x);
		System.out.println(c.x);
		System.out.println(c.y);
		
		Parent p2= new Child();
	}
}
