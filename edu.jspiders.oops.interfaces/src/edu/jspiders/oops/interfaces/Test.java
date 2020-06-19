package edu.jspiders.oops.interfaces;

public class Test 
{
	public static void main(String[] args) 
	{
		Oracle o = new Oracle();
		MySQL m = new MySQL();
		Postgres p= new Postgres();
		
		o.connect();
		o.disconnect();
		System.out.println("");
		
		m.connect();
		m.disconnect();
		System.out.println();
		
		p.connect();
		p.disconnect();
	}
}
