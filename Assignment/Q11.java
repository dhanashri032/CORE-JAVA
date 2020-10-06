package a1;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to swap: ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swapping numbers: "+x +"  "+ y); 
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: "+x +"  " + y); 

	}

}
