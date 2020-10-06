package a1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature into Fahrenheit ");
		float f = sc.nextFloat();
		sc.close();
		double C= 5*(f-32)/9;
		System.out.println("The Temperature in degree Celius: "+C+" degree");
	}

}
