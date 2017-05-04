import java.util.ArrayList;
import java.util.Scanner;

public class UVA_10935 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n =sc.nextInt();
			
			if(n==0)
			{
				break;
			}
			ArrayList<Integer> list =new ArrayList<>();
			for(int i=n;i>=1;i--)
			{
				list.add(i);
			}
			System.out.print("Discarded cards:");
			while(list.size()>2){
				int cur = list.get(list.size()-1);
				System.out.print(" "+cur+",");
				list.remove(list.size() -1);
				list.add(0, list.get(list.size()-1));
				list.remove(list.size()-1);
			}
			if(list.size()>1)
			{
				int cur =list.get(1);
				System.out.println(" "+cur);
			}
			else
			{
				System.out.println();
			}
			
			System.out.println("Remaining card: "+list.get(0));
			
		}
	}
}
