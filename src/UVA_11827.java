import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_11827 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		for(int t =0;t<T;t++){
			String line =sc.nextLine();
			StringTokenizer st =new StringTokenizer(line);
			ArrayList<Integer> list =new ArrayList<>();
			while(st.hasMoreTokens()){
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			int gcd = -1;
			for(int i=0;i<list.size()-1;i++){
				for(int j=i+1;j<list.size();j++)
				{
					gcd = Math.max(gcd, gcd(list.get(i),list.get(j)));
				}
			}
			System.out.println(gcd);
			
		}
		sc.close();
	}
	public static int gcd(int a , int b){
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}
}
