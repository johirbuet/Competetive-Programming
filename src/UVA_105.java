import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UVA_105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set =new TreeSet<>();
		while(sc.hasNextLine()){
			String ln =sc.nextLine();
			if(ln == null || ln.isEmpty()){
				break;
			}
			String [] line =ln.split(" ");
			int L = Integer.parseInt(line[0]);
			int H = Integer.parseInt(line[1]);
			int R = Integer.parseInt(line[2]);
			set.add(L);
			set.add(R);
			for(int i=L;i<R;i++){
				if(map.containsKey(i)){
					map.put(i, Math.max(map.get(i), H));
				}
				else{
					map.put(i, H);
				}
			}
			if(map.containsKey(R)){
				map.put(R, Math.max(map.get(R), 0));
			}
			else{
				map.put(R, 0);
			}
			
		}
		sc.close();
		String res ="";
		int i = 0;
		int prev =0;
		int size = 0;
		for (Integer integer : set) {
			int h = map.get(integer);
			if(h !=prev){
				if(i !=0 && size < set.size()){
					res = res+" ";
				}
				res = res +integer+" " +h;				
				prev = h;
				i++;
			}
			size++;
			
		}
		System.out.println(res);
	}
	
}
