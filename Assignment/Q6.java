package a1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle: ");
		double radius = sc.nextDouble();
		double x = (3.142857142857143)*radius*radius;
		double y = 2*(3.142857142857143)*radius;
		System.out.println("Area of Circle: "+x);
		System.out.println("Circumference of Circle: "+y);
	}

}
