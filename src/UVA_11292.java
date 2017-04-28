import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UVA_11292 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			String [] nm =line.split("\\s+");
			int n =Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			
			if(n==0 && m==0)
			{
				break;
			}
			PriorityQueue<Integer> pqg = new PriorityQueue<>(10, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}
				
			});
			PriorityQueue<Integer> pqk =new PriorityQueue<>(10, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}
				
			});
			for(int i =0;i<n;i++)
			{
				int num = Integer.parseInt(sc.nextLine());
				pqg.add(num);
			}
			for(int i=0;i<m;i++)
			{
				int num = Integer.parseInt(sc.nextLine());
				pqk.add(num);
			}
			int res =0;
			while(!pqk.isEmpty())
			{
				if(pqg.isEmpty())
				{
					break;
				}
				int num =pqk.poll();
				if(pqg.peek()<=num)
				{
					res = res + num;
					pqg.poll();
				}
			}
			if(pqg.isEmpty())
			{
				System.out.println(res);
			}
			else
			{
				System.out.println("Loowater is doomed!");
			}
		}
		sc.close();
	}

}
