package a1;

public class Q3 {

	public static void main(String[] args) {
		int x=1;
		int y = (x*x) + (3*x) - 7;
		int z = x++ - --y - --x;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		boolean X = true;
		boolean Y = false;
		boolean Z = X && Y || !(X || Y);
		System.out.println("Z = "+Z);
	}

}
