class Q27{
	public static void main(String args[])
	{
		int num[] = new int[]{11,22,33,44,55,66,77,88,99,100};
		int small = num[0];
		int big = num[0];

		for(int i=1; i< num.length; i++)
		{
			if(num[i] > big)
				big = num[i];
			else if(num[i] < small)
				small = num[i];
		}
		System.out.println("Largest Number=" + big);
		System.out.println("Smallest Number=" + small);		
	}
}