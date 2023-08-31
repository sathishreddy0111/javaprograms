
public class PolyDemo3 {

	public static void main(String[] args) {
		
		PolyDemo3 p1=new PolyDemo3();
		p1.funA(10, 20);
		p1.funA(100l, 200l);
		p1.funA(40, 30l);
		p1.funA(5l, 45);
		
		
	}
	 void funA(int a,int b) {
		   System.out.println("int int of funA");
		   System.out.println(a+" "+b);
		   }
	 void funA(long a,long b) {
		   System.out.println("long long of funA");
		   System.out.println(a+" "+b);
		   }
	 void funA(int a,long b) {
		   System.out.println("int long of funA");
		   System.out.println(a+" "+b);
		   }
	 void funA(long a,int b) {
		   System.out.println("long int of funA");
		   System.out.println(a+" "+b);
		   }

}
