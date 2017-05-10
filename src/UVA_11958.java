import java.util.Scanner;

public class UVA_11958 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		int c =0;
		for(int t=0;t<T;t++){
			c++;
			String line =sc.nextLine();
			String [] kt =line.split(" ");
			int k =Integer.parseInt(kt[0]);
			String [] hm =kt[1].split(":");
			int minute = Integer.parseInt(hm[0])*60+Integer.parseInt(hm[1]);
			int hstart = Integer.parseInt(hm[0]);
			int mstart = Integer.parseInt(hm[1]);
			int time = Integer.MAX_VALUE;
			for(int i=0;i<k;i++){
				line =sc.nextLine();
				String [] tn =line.split(" ");
				String [] hmk = tn[0].split(":");
				int h =Integer.parseInt(hmk[0]);
				int m =Integer.parseInt(tn[1]);
				if(h<hstart)
				{
					h = h + (24-hstart);
					
				}
				int atime = h*60+ Integer.parseInt(hmk[1])+m;
				if(atime-minute < time){
					time = atime-minute;
				}
			
			}
			System.out.printf("Case %d: %d\n",c,time);
		}
		
	}
}
