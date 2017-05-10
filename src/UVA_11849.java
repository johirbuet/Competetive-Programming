import java.util.HashMap;
import java.util.Scanner;

public class UVA_11849 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int N =sc.nextInt();
			int M =sc.nextInt();
			if(N==0 && M==0){
				break;
			}
			HashMap<Integer, Boolean> map =new HashMap<>();
			for(int i=0;i<N;i++)
			{
				map.put(sc.nextInt(), true);
			}
			int count =0;
			for(int i=0;i<M;i++){
				if(map.containsKey(sc.nextInt())){
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
