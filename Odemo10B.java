
public class Odemo10B {

	public static void main(String[] args) {
		Odemo10B d1=new Odemo10B();
		A x=d1.getA(4);
		A x2=d1.getA(7);
		int i=d1.getA(7);
		
		A x3=d1.getA(7).funA();
		int b=d1.getA(7).funA();
		int c=d1.getA(7);
		
	
	} 
	A getA(int x)//A getA(int x)=a1;
	{
		A a1=new A();
		a1.i=x;
		a1.j=x+1;
		return a1;
	}
	

}
