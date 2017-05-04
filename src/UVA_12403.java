import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_12403 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int sum =0;
		for(int i=0;i<T;i++){
			String line =sc.nextLine();
			if(line.startsWith("donate"))
			{
				StringTokenizer st =new StringTokenizer(line);
				st.nextToken();
				int a =Integer.parseInt(st.nextToken());
				sum +=a;
			}
			else
			{
				System.out.println(sum);
			}
		}
		sc.close();
	}
}
