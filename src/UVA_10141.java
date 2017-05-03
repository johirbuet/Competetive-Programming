import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			StringTokenizer st =new StringTokenizer(line);
			int N =Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			if(N==0 && P ==0)
			{
				break;
			}
			HashSet<String> requirements = new HashSet<>();
			for(int i=0;i<N;i++)
			{
				requirements.add(sc.nextLine());
			}
			for(int i=0;i<P;i++)
			{
				line =sc.nextLine();
			}
		}
	}

}
