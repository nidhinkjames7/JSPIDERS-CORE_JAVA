package edu.jspiders.oops.interfaces;

public class MySQL implements Connection
{
	public void connect() 
	{
		System.out.println("Connect to MySQL");
	}
	public void disconnect()
	{
		System.out.println("Disconnect from MySQL");
	}
}
