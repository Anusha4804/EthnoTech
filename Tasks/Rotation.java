
import java.util.*;
public class Rotation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(k>0)
			{
				for(int j=0;j<k;j++)
				{
					arr[i]=arr[i+1];
				}
			}
		}
		for(int ele:arr)
		{
			System.out.println(ele+" ");
		}
		
	}
}
