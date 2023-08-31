
public class Odemo1 {
int x,y;
void fun1()
{
	x=x+1;
	Odemo1 d1=new Odemo1();
	
	d1.x=x+2;
}
	public static void main(String[] args) {
		Odemo1 d1=new Odemo1();
		d1.fun1();
	
		System.out.println(d1.x);
		
	}

}
