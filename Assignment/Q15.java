import java.util.Scanner;
class Q15{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age");
	int age = sc.nextInt();
	System.out.println("Enter sex: m/f");
	String sex = sc.next();
	if((age >=20) && (age < 40)) {
	System.out.println(sex+ " is eligible for married");
	}else{
	System.out.println(sex+ " is not eligible for married");
	}
	}
} 
		
