package a1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Days: ");
		int day = sc.nextInt();
		sc.close();
		int year = day/365;
		day = day%365;
		System.out.println("No of Years: "+year);
		int week = day/7;
		day = day%7;
		System.out.println("No of Weeks: "+week);
		int d = day;
		System.out.println("No of Days: "+day);
	}

}
