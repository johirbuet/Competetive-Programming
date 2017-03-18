import java.util.Arrays;
import java.util.Scanner;

public class UVA10041 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int r=sc.nextInt();
			int [] rels=new int[r];
			for(int i=0;i<r;i++)
			{
				rels[i]=sc.nextInt();
			}
			Arrays.sort(rels);
			int mid=rels[r/2];
			int dif=0;
			for(int i=0;i<r;i++)
			{
				dif=dif+Math.abs(mid-rels[i]);
			}
			System.out.println(dif);
		}
	}
}
