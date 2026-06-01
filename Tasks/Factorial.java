
import java.util.*;
public class Factorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=sc.nextInt();
		int res=factorial(n);
		System.out.println("Factorial of a number:"+res);
		
	}
	public static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
		
	}

}
 