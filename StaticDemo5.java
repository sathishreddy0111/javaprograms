
public class StaticDemo5 {
	int a=10;
	static int b=20;
	public static void main(String[] args) {
		System.out.println("main method starts");
		StaticDemo5 s1=new StaticDemo5();
		System.out.println("Done");
		

	}
	int funA()
	{
		System.out.println("FunA starts");
		return a;
	}
	static int funB()
	{
		System.out.println("FunB starts");
		return b;
	}

}
