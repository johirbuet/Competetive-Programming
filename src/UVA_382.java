import java.util.HashSet;
import java.util.Scanner;

public class UVA_382 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String out ="PERFECTION OUTPUT\n";
		while(sc.hasNextInt())
		{
			int n= sc.nextInt();
			if(n == 0)
			{
				break;
			}
			int sum = 0;
			HashSet<Integer> set =new HashSet<>();
			
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					set.add(i);
					set.add(n/i);
				}
			}
			if(n!=1)
			{
				sum = sum+1;
			}
			for (Integer integer : set) {
				sum+=integer;
			}
			if(sum == n)
			{
				out = out + String.format("%5d  PERFECT\n", n);
			}
			else if(sum<n)
			{
				out = out + String.format("%5d  DEFICIENT\n", n);
			}
			else
			{
				out = out + String.format("%5d  ABUNDANT\n", n);
			}
		}
		out = out+"END OF OUTPUT";
		System.out.println(out);
	}
}
