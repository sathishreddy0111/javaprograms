
public class PolyDemo2 {

	public static void main(String[] args) {
		
		
		PolyDemo2 p1=new PolyDemo2();
		p1.funA();
		p1.funA(10);
		p1.funA(20,10);
		
	}
	 void funA() {
		   System.out.println("zero args of funA");
	}
	   
	   void funA(int a) {
	System.out.println("int of funA");
	System.out.println(a);
	   }
	   void funA(int a,int b) {
		   System.out.println("int int of funA");
		   
		   }
}
