
public class PloyDemo4 {

	public static void main(String[] args) {
		PloyDemo4 p1=new PloyDemo4();
		
		p1.funA();
		
		A x=new A();
		p1.funA(x);
		p1.funA(new A());
		
		B y=new B();
		p1.funA(y);
		p1.funA(new B());
		
		 C z=new C();
		p1.funA(z);
		p1.funA(new C());
	
		

	}
	void funA()
	{
		System.out.println("zero args of funA");
	}
	void funA(A a1)
	{
		System.out.println("class A args of funA");
		System.out.println(a1);
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
