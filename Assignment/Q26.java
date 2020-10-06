class Q26{
	public static void main(String args[]){
	int a[] = {1,2,3};
	int b[] = {4,5,6,16};
	int c[] = {7,8,9,17};
	int d[] = {1,1,1};
	int e[] = {3,4,5};
	int sum = 0;
	int arr[] [] = new int[5][];
	arr[0] = a;
	arr[1] = b;
	arr[2] = c;
	arr[3] = d;
	arr[4] = e;
	for(int ar[] : arr){
		for(int m : ar){
			System.out.print(" "+m);
			sum = sum + m;
		}
		System.out.println(" ");
		}
		System.out.println("Sum = "+sum);
	}
}