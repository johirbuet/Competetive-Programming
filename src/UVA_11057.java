import java.util.HashMap;
import java.util.Scanner;

public class UVA_11057 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int N = sc.nextInt();
			int [] books =new int[N];
			for(int i=0;i<N;i++){
				books[i] = sc.nextInt();
			}
			int M =sc.nextInt();
			HashMap<Integer, Integer> map =new HashMap<>();
			int first =0;
			int second=0;
			int diff = Integer.MAX_VALUE;
			for(int i =0; i<N;i++){
				int target = M - books[i];
				if(map.containsKey(target)){
					int d = Math.abs(target-books[i]);
					if(d>diff){
						continue;
					}
					diff= d;
					first = Math.min(books[i], target);
					second =  Math.max(books[i], target);
				}
				else
				{
					map.put(books[i], i);
				}
			}
			System.out.printf("Peter should buy books whose prices are %d and %d.\n\n",first,second);
		}
		sc.close();
	}
}
