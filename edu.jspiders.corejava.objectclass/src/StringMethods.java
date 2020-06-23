
public class StringMethods 
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="world";
		String s3="hello";
		String s4="apple";
		
		System.out.println("s1.length()-->"+s1.length());
		System.out.println("s1.toUpperCase()-->"+s1.toUpperCase());
		System.out.println("s1.toLowerCase()-->"+s1.toLowerCase());
		System.out.println("s1.startsWith()-->"+s1.startsWith("he"));
		System.out.println("s1.endsWith()-->"+s1.endsWith("lo"));
		System.out.println("s1.chatAt()-->"+s1.charAt(3));
		System.out.println("s1.indexOf()-->"+s1.indexOf("o"));
		
		System.out.println("s1.concat()-->"+s1.concat(s2));
		
		System.out.println("s1.compareTo()-->"+s1.compareTo(s2));
		System.out.println("s1.compareTo()-->"+s1.compareTo(s3));
		System.out.println("s1.compareTo()-->"+s1.compareTo(s4));		
	}
}
