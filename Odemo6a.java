
public class Odemo6a {
	int x=4;
	A a1=new A();
	Odemo6a d1;
	public static void main(String[] args) {
		System.out.println("Main method start");
		Odemo6a d1 =new Odemo6a();
		System.out.println(d1.x);
		System.out.println(d1.d1);
		
		d1.d1=new Odemo6a();
		d1.d1.d1=new Odemo6a();
		int x=6;
		d1.d1.d1.x=x;
		d1.d1.d1.d1=d1;
		d1.d1.d1.d1.x=13;
		System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.x);
		System.out.println(d1.d1.d1.d1.d1.d1.d1);
		System.out.println(d1.d1.d1);
		
	}

}
