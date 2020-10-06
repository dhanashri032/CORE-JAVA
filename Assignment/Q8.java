package a1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		double p = sc.nextDouble();
		System.out.println("Enter Time:");
		double n = sc.nextDouble();
		System.out.println("Enter Rate of interest:");
		double r = sc.nextDouble();
		double si = (p*n*r)*0.01;
		System.out.println("Simple Interest = "+si);

	}

}
