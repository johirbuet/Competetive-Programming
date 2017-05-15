import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * It will get TLE as the run time is O(n!)
 */

public class UVA_11076 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int N =sc.nextInt();
			String res = "";
			for(int i=0;i<N;i++){
				res =res+sc.nextInt();
			}
			ArrayList<String> list =new ArrayList<>();
			getPerm(res,0,N,list);
			BigInteger sum = BigInteger.ZERO;
			for (String string : list) {
				BigInteger bi =new BigInteger(string);
				sum =sum.add(bi);
			}
			System.out.println(sum.toString());
		}
		sc.close();
	}
	
	public static void getPerm(String s, int start,int end, ArrayList<String> list){
		if(start == end){
			if(!list.contains(s)){
				list.add(s);
			}
		}
		
		for(int i = start;i<end;i++){
			char [] carr =s.toCharArray();
			for(int j=start;j<end;j++){
				char temp =carr[i];
				carr[i] =carr[j];
				carr[j] =temp;
				getPerm(new String(carr), start+1, end, list);
				temp =carr[i];
				carr[i] =carr[j];
				carr[j] =temp;
			}
		}
	}
}
