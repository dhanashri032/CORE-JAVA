import java.util.Scanner;
class Q25{ 
    public static void main(String args[]) 
    {
        int sumE = 0, sumO = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < num; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of Even Num:"+sumE);
        System.out.println("Sum of Odd Num:"+sumO);
    }
}