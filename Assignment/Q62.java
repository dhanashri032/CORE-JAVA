package a1;

import java.util.Scanner;

public class Q62 {

	public static void main(String[] args) {
		MyRunnable m = new MyRunnable();
		Thread th1 = new Thread(m);
		//Thread th2 = new Thread(m);
		th1.start();
	//	th2.start();
	}
}
class MyRunnable implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		sc.close();
		boolean flag = false;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(a+ " is a Prime Number");
		else
			System.out.println(a+ " is not a Prime Number");
	}
	
}
