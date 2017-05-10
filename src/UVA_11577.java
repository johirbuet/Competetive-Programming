import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UVA_11577 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		
		for(int t =0;t<T;t++){
			String line =sc.nextLine().toLowerCase();
			HashMap<Character, Integer> map =new HashMap<>();
			char [] cr = line.toCharArray();
			for (char c : cr) {
				if(c==' ')
				{
					continue;
				}
				if(!(c>='a' && c<='z')){
					continue;
				}
				if(map.containsKey(c)){
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
			PriorityQueue<CI> pq =new PriorityQueue<>(10, new Comparator<CI>() {
				@Override
				public int compare(CI o1, CI o2) {
					if(o1.count<o2.count)
					{
						return 1;
					}
					else if(o1.count==o2.count){
						return 0;
					}
					else
					{
						return -1;
					}
				}
			});
			
			for(char c :map.keySet())
			{
				CI obj =new CI(c,map.get(c));
				pq.add(obj);
			}
			int count =-1;
			ArrayList<Character> list =new ArrayList<>();
			while(!pq.isEmpty()){
				CI c =pq.poll();
				if(c.count>=count){
					count =c.count;
					list.add(new Character(c.c));
				}
			}
			String res = "";
			Collections.sort(list);
			
			for (Character character : list) {
				res =res+character;
			}
			//res = new StringBuffer(res).reverse().toString();
			System.out.println(res);
		}
	}

}
class CI{
	public char c;
	public int count;
	public CI(char c, int count) {
		this.c = c;
		this.count = count;
	}
	@Override
	public String toString() {
		return "("+ c + ","+count+");";
	}
	
}
