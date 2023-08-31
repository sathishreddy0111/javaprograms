
public class PolyDemo1 {

	public static void main(String[] args) 
	{
		PolyDemo1 p1=new PolyDemo1();
		p1.funA();
		p1.funA(10);
		p1.funA(20l);
		p1.funA(20.3f);
		p1.funA(20.45);
		
	}
   void funA() {
	   System.out.println("zero args of funA");
}
   
   void funA(int a) {
System.out.println("int of funA");
System.out.println(a);
   }
   void funA(long b) {
	   System.out.println("long of funA");
	   System.out.println(b);
	      }
   void funA(float f) {
	   System.out.println("float of funA");
	   System.out.println(f);
	      }
   void funA(double d) {
	   System.out.println("double of funA");
	   System.out.println(d);
	      }
  
	      }
   
