package edu.jspiders.corejava.stringclass;

public class stringClassExample 
{
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2=new String("Hello");
		
		System.out.println("s1.toString-->s1: "+s1);
		System.out.println("s2.toString-->s2: "+s2);
		
		System.out.println("s1.hashCode()-->"+s1.hashCode());
		System.out.println("s2.hashCode()-->"+s2.hashCode());
		
		System.out.println("s1.equals(s2)-->"+s1.equals(s2));
	}
}
