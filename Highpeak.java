import java.util.Scanner;

public class HighMax
{
	public static int[] maximizeEarning(int[][] a)
	{
		int max = a[0][2];
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][2];
			if(max<a[i][2])
				max = a[i][2];
			
		}
		
		int[] result = new int[2];
		result[0] = a.length-1;
		result[1] = sum-max;
		
		return result;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Jobs");
		int njobs = sc.nextInt();
        
		if(njobs<=100)
		{
			System.out.println("Enter job start time, end time, and earnings");
			int a[][] = new int[njobs][3];
			for(int i=0;i<a.length;i++)
			{
				
				for(int j=0;j<a[0].length;j++)
				{
					a[i][j] = sc.nextInt();
	            }
				if(a[0][0]>a[0][1]||a[1][0]>a[1][1]|| a[2][0]>a[2][1])
				{
					System.out.println("not valid");
				}
				
		
			}
			
			int result[] = maximizeEarning(a);
		
		    for(int i: result)
		    {
		    	System.out.println(i);
		    }
		

		}
		else 
		{
			System.out.println("Please enter below "+njobs);
		}
	}
	
	

}
