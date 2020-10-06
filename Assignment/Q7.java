package a1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total =500;
		System.out.println("Enter the 1st Subject Marks:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Subject Marks:");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd Subject Marks:");
		int c = sc.nextInt();
		System.out.println("Enter the 4th Subject Marks:");
		int d = sc.nextInt();
		System.out.println("Enter the 5th Subject Marks:");
		int e = sc.nextInt();
		double sum = a+b+c+d+e;
		double percentage = (sum*100)/total;
		System.out.println("Sum of 5 subjects marks: " +sum);
		System.out.println("Percentage: " +percentage);

}
}