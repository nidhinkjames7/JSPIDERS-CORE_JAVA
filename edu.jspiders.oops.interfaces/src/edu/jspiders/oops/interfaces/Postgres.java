package edu.jspiders.oops.interfaces;

public class Postgres implements Connection
{
	public void connect() 
	{
		System.out.println("Connect to Postgres");
	}
	public void disconnect()
	{
		System.out.println("Disconnect from Postgres");
	}
}
