import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UVA_12015 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		int c =0;
		for(int t =0;t<T;t++){
			c++;
			PriorityQueue<SE> pq =new PriorityQueue<SE>(10, new Comparator<SE>() {
				@Override
				public int compare(SE o1, SE o2) {
					if(o1.count<o2.count)
					{
						return 1;
					}
					else if(o1.count>o2.count)
					{
						return -1;
					}
					else
					{
						return 0;
					}
				}
			});
			
			for(int p = 0;p<10;p++){
				String line =sc.nextLine();
				String [] uc =line.split(" ");
				int count =Integer.parseInt(uc[1]);
				String url =uc[0];
				SE se =new SE(url,count,p);
				pq.add(se);
			}
			int max = -1;
			String [] list =new String[10];
			while(true)
			{
				SE se =pq.poll();
				if(se.count>=max)
				{
					max = se.count;
					list[se.index] = se.url;
				}
				else
				{
					break;
				}
			}
			System.out.printf("Case #%d:\n",c);
			for(int i=0;i<10;i++)
			{
				if(list[i]!=null)
				{
					System.out.println(list[i]);
				}
			}			
			
			
		}
	}
	
	
}
class SE {
	public String url;
	public int count;
	public int index;
	public SE(String url,int count,int index) {
		this.url =url;
		this.count =count;
		this.index =index;
	}
	@Override
	public String toString() {
		return url + " "+count;
	}
}