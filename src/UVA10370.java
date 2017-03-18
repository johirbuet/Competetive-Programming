import java.util.Scanner;

public class UVA10370 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int [] arr=new int[n];
			double sum=0;
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			double avg=sum/n;
			int count=0;
			for (int i : arr) {
				if(i>avg)
				{
					count++;
				}
			}
			double above=(double) count/n;
			above=above*100;
			System.out.printf("%.3f%%\n",above);
			
		}
	}
}
