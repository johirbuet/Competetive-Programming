import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class UVA_941 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while(T-->0){
			String str =sc.nextLine();
			char [] c =str.toCharArray();
			Arrays.sort(c);
			str =new String(c);
			long N =Long.parseLong(sc.nextLine());
			StringBuilder sb =new StringBuilder(str);
			ArrayList<Integer> factoradic =new ArrayList<>();
			int i =1;
			while(N>=0){
				factoradic.add((int)(N%i));
				N =N/i;
				i++;
			}
			String res ="";
			Collections.reverse(factoradic);
			for(int j=0;j<factoradic.size();j++){
				res = res + sb.charAt(factoradic.get(j));
				sb = sb.deleteCharAt(factoradic.get(j));
			}
			
			res =res +sb.toString();
			System.out.println(res);
		}
		sc.close();
	}
}
