package edu.jspiders.oops.interfaces;

public class Oracle implements Connection
{
	public void connect() 
	{
		System.out.println("Connect to Oracle");
	}
	public void disconnect()
	{
		System.out.println("Disconnect from Oracle");
	}
}
