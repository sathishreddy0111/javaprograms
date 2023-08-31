
public class BudzDemo2 {

	public static void main(String[] args) {

		int grossSalary = 10000;
		BudzDemo2 d1=new BudzDemo2();
		//int netSalary=grossSalary-houseCharges();
		int netSalary=grossSalary-d1.houseCharges();
		System.out.println(netSalary);
	}
	
	int houseCharges() {
	
	 int rent=3000;
	 int childfee=2000;
	int totalCharges=rent+childfee;
	return totalCharges;
	}
	

}
