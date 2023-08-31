
public class StaticDemo5A {

	int a=funA();
	static int b=funB();
	public static void main(String[] args) {
		System.out.println("main method starts");
		StaticDemo5A s1=new StaticDemo5A();
		s1.funA();
		System.out.println(s1.a);
		s1.funB();
		System.out.println(s1.b);
		System.out.println("done");
		new StaticDemo5A();
		new StaticDemo5A();
		new StaticDemo5A();
		

	}
	int funA()
	{
		System.out.println("FunA starts");
		return 10;
	}
	static int funB()
	{
		System.out.println("FunB starts");
		return 20;
	}

}
