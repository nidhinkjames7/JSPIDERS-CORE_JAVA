package edu.jspiders.corejava.objectclass.toString;

public class Pen 
{
	public int slno;
	public String brand;
	public String name;
	public double price;
	
	Pen(int slno,String brand,String name, double price)
	{
		this.slno=slno;
		this.brand=brand;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString()
	{
		return "Serial Number="+this.slno+" Brand= "+this.brand+" Name= "+this.name+" Price= "+this.price;
	}
	
	@Override
	public int hashCode()
	{
		return slno;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Pen p=(Pen) obj;
		return this.price==p.price;
	}
}
