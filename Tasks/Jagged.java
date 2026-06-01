
public class Jagged {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int[][] arr=new int[3][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int total=0;
			System.out.println("Student:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("subject:"+(j+1));
				total+=arr[i][j];
				
				
			}
			double avg=(double) total/arr[i].length;
			System.out.println("Total:"+total);
			System.out.println("Average:"+avg);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
 
