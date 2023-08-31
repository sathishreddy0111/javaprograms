
public class Odemo8a {

	void funA(A a1)
	{
		System.out.println(a1);
		if(a1!=null)
		{
			a1.i=a1.i+1;
			a1.j=a1.j+2;
		}
			System.out.println("end of funA");
		
	}
		public static void main(String[] args) {
			Odemo8 d1=new Odemo8();
			A k=new A();
			d1.funA(k);
			System.out.println(k.i);
			System.out.println(k.j);
		}
}
