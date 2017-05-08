import java.util.Scanner;

public class UVA_12602 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		for(int t=0;t<T;t++){
			String [] an =sc.nextLine().split("-");
			int snum = (an[0].charAt(0)-'A')*26*26+ (an[0].charAt(1)-'A')*26+ (an[0].charAt(2)-'A');
			int nnum =Integer.parseInt(an[1]);
			int dif = Math.abs(snum  - nnum);
			System.out.println(dif<=100?"nice":"not nice");
		}
		sc.close();
	}
}
