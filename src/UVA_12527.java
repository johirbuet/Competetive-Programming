import java.util.HashSet;
import java.util.Scanner;

public class UVA_12527 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int M =sc.nextInt();
			int N =sc.nextInt();
			int count =0;
			for(int i=M;i<=N;i++)
			{
				String s = String.valueOf(i);
				HashSet<Character> set =new HashSet<>();
				char [] c =s.toCharArray();
				for (char d : c) {
					set.add(d);
				}
				if(set.size() == s.length()){
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
