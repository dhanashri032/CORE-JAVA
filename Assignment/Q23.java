import java.util.Scanner;
class Q23{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); 
		int arr[]=new int[5];
		int arr1[]=new int[5];
		int j=0;
		System.out.println("Enter element");
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse array is=");	
		for(int i=5; i>0; i--, j++)
		{
			arr1[j] = arr[i-1];
            		System.out.println(arr1[j]);
		}
	}
}