
public class PolyDemo4A {

	A a;
	
	public static void main(String[] args) {
		PolyDemo4A p1=new PolyDemo4A();
		
		/*A a=null;
		B b=null;
		C c=null;

	p1.funA();
		p1.funA(a);
		p1.funA(b);
		p1.funA(c);*/
		A a=new A();
p1.funA(a);
	
	}
	void funA()
	{
		System.out.println("zero args of funA");

		
		
	}
	void funA(A a1)
	{
		A a=a1;
		System.out.println("class A args of funA");
		System.out.println(a);
	}
	void funA(B b1)
	{
		System.out.println("class b args of funA");
		System.out.println(b1);
	}
	void funA(C c1)
	{
		System.out.println("class c args of funA");
		System.out.println(c1);
	}
}
