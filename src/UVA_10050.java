import java.util.HashSet;
import java.util.Scanner;

public class UVA_10050 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int t=0;t<T;t++){
			int D =sc.nextInt();
			int P =sc.nextInt();
			HashSet<Integer> set =new HashSet<>();
			for(int i=1;i<=D;i++){
				set.add(i);
			}
			int [] h =new int[P];
			for(int i=0;i<P;i++){
				h[i] =sc.nextInt();
				for(int d = h[i];d<=D;d+=h[i]){
					if(d%7!= 0 && d%7!=6){
						set.remove(d);
					}
				}
			}
			System.out.println(D - set.size());
			
		}
		sc.close();
	}
}
