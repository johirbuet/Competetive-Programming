import java.util.Scanner;

public class UVA299 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int [] a=new int[n];
			for (int i = 0; i < n; i++) {
				a[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						count++;
					}
				}
			}
			System.out.println("Optimal train swapping takes "+count+" swaps.");
		}
		sc.close();
	}
}
