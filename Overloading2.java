class Overloading2
{
	public void m1(String s)
	{
		System.out.println("String Version");
	}
	
	public void m1(Object o)
	{
		System.out.println("Object Version");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("String Buffer Version");
	}
	
	public static void main(String[] args)
	{
		Overloading2 o2 = new Overloading2();
		o2.m1(new Object());
		o2.m1("Snehal");
		o2.m1(new StringBuffer("Snehal"));
		//o2.m1(null);
	}
}