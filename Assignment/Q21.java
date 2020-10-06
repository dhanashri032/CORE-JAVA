import java.util.Scanner; 
class Q21{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int sum = 0;
	int arr[]=new int[10];
	for(int i=0; i<arr.length; i++)
	{
		System.out.println("Enter element");
		arr[i]=sc.nextInt();
		sum=sum+arr[i];
	}
	System.out.println(sum);
	}
}