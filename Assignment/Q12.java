import java.util.Scanner;
class Q12{
	public static void main(String args[]){
	double basic,hra,da,gs;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee salary:");
	basic = sc.nextDouble();
	if(basic < 10000){
		hra = 0.1*basic;
		da = 0.9*basic;
		gs = basic + hra + da;
		System.out.println("Gross Salary= " +gs);
	} else {
		gs = basic + (2000) + (0.98*basic);
		System.out.println("Gross Salary= " +gs);
		}
	}
}