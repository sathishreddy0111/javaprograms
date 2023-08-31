
public class Odemo10A {
	


	public static void main(String[] args) {
		
		Odemo10A d1=new Odemo10A();
		Ramesh x= d1.funA();
		System.out.println(x);
		//System.out.println(d1.funA());//      we can print like this also.
		
		Ramesh y= d1.funB();
		System.out.println(y);
		Ramesh z= d1.funC();
		System.out.println(z);
		
	}
	
	Ramesh funA()
	{
		
		Ramesh r1=new Ramesh();
		return r1;
	}
	Ramesh funB()
	{
		
		
		return new Ramesh();
	}
	Ramesh funC()
	{
		
		
		return null;
	}

}
