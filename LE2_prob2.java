class Mother 
{
	void show()
	{
		System.out.println("HELLO WORLD()");
	}
}
class Child extends Mother 
{
	void show()
	{
		System.out.println("HELLO JUET()");
	}
}
class Main 
{
	public static void main(String[] args)
	{
		Mother r1 = new Mother();
		r1.show();
		Child r2 = new Child();
		r2.show();
	}
}