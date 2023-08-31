
public class Odemo8b {

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
			int a=20;
			d1.funA(a1);
			System.out.println(a1.i);
			System.out.println(a1.j);
		}
}
