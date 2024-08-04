class type_casting 
{
	public static void main(String[] args) 
	{
		System.out.println("Widening");
		System.out.println("-----------------");
		widening();
		System.out.println();
		System.out.println("-----------------");
		System.out.println("Narrowing");
		narrowing();
		System.out.println("-----------------");
		
		

		System.out.println("-----------------");
	}
	
	public static void widening()
	{
		char a='A';
		int b=a;
		System.out.println("char => int " +b);
		System.out.println("-----------------");
		long c=a;
		System.out.println("char => long " +c);
		System.out.println("-----------------");
		double d=a;
		System.out.println("char => double " +d);
		System.out.println("-----------------");
		float e=a;
		System.out.println("char => float " +e);
		System.out.println("-----------------");
		float f=b;
		System.out.println("int => float " +f);
		System.out.println("-----------------");
		double g=b;
		System.out.println("int => double " +g);
		System.out.println("-----------------");
		long h=b;
		System.out.println("int => long " +h);
		System.out.println("-----------------");
	}
	public static void narrowing()
	{
		//long=>int=>char;
		//double=>float=>char=>int=>;
		//float=>long=>int=>char;
		//int=>char;
		//byte=>char;

		long a=78;
		int b= (int) a;
		System.out.println("long => int "+ b);





	}
}
