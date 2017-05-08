import java.util.Scanner;

public class UVA_12626 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		for(int n =0;n<T;n++){
			String line =sc.nextLine();
			char [] carr =line.toCharArray();
			int m=0,r=0,a=0,t=0,g=0,i=0;
			int total =0;
			for (char c : carr) {
				if(c=='M')
				{
					m++;
				}
				if(c=='R'){
					r++;
				}
				if(c=='A'){
					a++;
				}
				if(c=='T'){
					t++;
				}
				if(c=='G'){
					g++;
				}
				if(c=='I'){
					i++;
				}
				if(a>=3 &&  m>=1 && r >=2 && g>=1 && i>=1 && t>=1){
					total++;
					a-=3;
					m-=1;
					r-=2;
					g-=1;
					i-=1;
					t-=1;
				}
			}
			System.out.println(total);
		}
	}
}
