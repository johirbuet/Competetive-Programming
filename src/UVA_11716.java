import java.util.Scanner;

public class UVA_11716 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int i =0; i<N;i++){
			String s =sc.nextLine();
			int l =s.length();
			int r = (int)Math.sqrt(l);
			if(r*r!=l){
				System.out.println("INVALID");
			}
			else
			{
				StringBuilder sb =new StringBuilder();
				for(int f=0;f<r;f++){
					for(int e=f;e<s.length();e+=r){
						sb.append(s.charAt(e));
					}
				}
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}

}
