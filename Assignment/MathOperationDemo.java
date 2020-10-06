import java.util.Scanner;
class MathOperation{
	static int add(int x,int y)
	{
		return x+y;		
	}
	static int sub(int x,int y)
	{
		return x-y;
	}
	static int mul(int x,int y)
	{
		return x*y;
	}
	static double power(int x,int y)
	{
		return Math.pow(x,y);
	}
}

class MathOperationDemo{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Addition is " +MathOperation.add(x,y));
		System.out.println("Substraction is " +MathOperation.sub(x,y));
		System.out.println("Multiplication is " +MathOperation.mul(x,y));
		System.out.println("Power is " +MathOperation.power(x,y));
	}
}