class Overriding5
{
	int x=888;
}
class Child5 extends Overriding5
{
	int x=999;
}
class Test5
{
		public static void main(String[] args)
		{
			Overriding5 o5=new Overriding5();
			System.out.println(o5.x);
			Child5 c5=new Child5();
			System.out.println(c5.x);
			Overriding5 o1=new Child5();
			System.out.println(o1.x);
		}
}
