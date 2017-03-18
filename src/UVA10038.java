import java.util.HashSet;
import java.util.Scanner;

public class UVA10038 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int [] nums=new int [n];
			HashSet<Integer> set=new HashSet<>();
			for(int i=1;i<n;i++)
			{
				set.add(i);
			}
			for(int i=0;i<n;i++)
			{
				nums[i]=sc.nextInt();
			}
			for(int i=0;i<n-1;i++)
			{
				int dif=Math.abs(nums[i]-nums[i+1]);
				set.remove(dif);
			}
			if(set.size()==0)
			{
				System.out.println("Jolly");
			}
			else
			{
				System.out.println("Not jolly");
			}
		}
		sc.close();
	}

}
