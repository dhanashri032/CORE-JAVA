import java.util.Scanner;
class Circle{
	private int radius;
	private double area;
	void init(int radius)
	{
		this.radius = radius;				
	}
	void calculateArea()
	{
		this.area = 3.142857142857143*(radius*radius);
	}
	void display()
	{
		System.out.println("Radius of Circle = "+radius);
		System.out.println("Area of Circle = "+area);
	}
}

class CircleDemo{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int radius = sc.nextInt();
		Circle c = new Circle();
		c.init(radius);
		c.calculateArea();
		c.display();
	}	
}