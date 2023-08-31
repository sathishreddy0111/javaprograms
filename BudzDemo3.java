
public class BudzDemo3 {
	
	public static void main(String[] args) {

		int grossSalary = 10000;
		BudzDemo3 d1=new BudzDemo3();
		//int netSalary=grossSalary-houseCharges();
		int charges=d1.houseCharges();
		int netSalary=grossSalary-charges;
		System.out.println(netSalary);
		//suppose we need to add the tax call how should we write
		int taxCal=30*charges;
		System.out.println(taxCal);
	}
	
	int houseCharges() {
		
		System.out.println("house charges is invoking");
	 int rent=1000;
	 int childfee=2000;
	int totalCharges=rent+childfee;
	System.out.println(totalCharges);
	return totalCharges ;
	}
}
