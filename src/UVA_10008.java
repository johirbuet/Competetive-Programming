import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UVA_10008 {
	public static void main(String[] args) {
		HashMap<Character, Integer> map =new HashMap<>();
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++){
			String line =sc.nextLine().toUpperCase();
			char [] carr = line.toCharArray();
			for (char c : carr) {
				if(c>='A' && c<='Z'){
					if(map.containsKey(c)){
						map.put(c, map.get(c)+1);
					}
					else
					{
						map.put(c, 1);
					}
				}
			}
		}
		
		sc.close();
		
		PriorityQueue<CV> pq =new PriorityQueue<CV>(10,new Comparator<CV>() {

			@Override
			public int compare(CV o1, CV o2) {
				if(o1.count<o2.count)
				{
					return 1;
				}
				else if(o1.count>o2.count){
					return -1;
				}
				else
				{
					if(o1.c < o2.c)
					{
						return -1;
					}
					else if(o1.c>o2.c){
						return 1;
					}
					else
					{
						return 0;
					}
				}
			}
			
		});
		for (char c : map.keySet()) {
			CV cv =new CV(c,map.get(c));
			pq.add(cv);
		}
		while(!pq.isEmpty()){
			CV cv =pq.poll();
			System.out.println(cv.c+" "+cv.count);
		}
	}
}

class CV{
	public char c;
	public int count;
	public CV(char c, int count) {
		this.c = c;
		this.count = count;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ "+c +","+count+"]";
	}
	
}