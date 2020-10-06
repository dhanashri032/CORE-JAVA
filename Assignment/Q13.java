import java.util.Scanner;
class Q13{
    public static void main(String[] args){
        int num1,num2,num3,temp,result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 number:");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
 	temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.println("Largest Number is:"+result);
    }
}