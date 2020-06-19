package edu.jspiders.oops.overridingtopic;

public class Test 
{
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		Suresh s= new Suresh();
		Ramesh r= new Ramesh();
		Mukesh m= new Mukesh();
		
		System.out.println("******PARENT PROPERTIES******");
		System.out.println();
		p.marriage();
		p.dowry();
		System.out.println();
		
		System.out.println("******SURESH PROPERTIES******");
		System.out.println();
		s.marriage();
		s.dowry();
		System.out.println();
		
		System.out.println("******RAMESH PROPERTIES******");
		System.out.println();
		r.marriage();
		r.dowry();
		System.out.println();
		
		System.out.println("******MUKESH PROPERTIES******");
		System.out.println();
		m.marriage();
		m.dowry();
		
		
	}
}
