
public class Practice1 {

	public static void main(String[] args) {
		Practice1 p1 =new Practice1();
		A a1=new A();
		
		
	   int x=p1.funA(a1);
       System.out.println(x);
     
       p1.funB(a1);
	}
	int funA(A a1)
	{
		
		return 10;
	}
	
	void funB(A a1)
	{
		System.out.println(a1); 
	}

}
