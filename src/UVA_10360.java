import java.util.Scanner;

public class UVA_10360 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++){
			int [][] killed =new int[1025][1025];
			int d =sc.nextInt();
			int r =sc.nextInt();
			while(r-->0){
				int x =sc.nextInt();
				int y =sc.nextInt();
				int p =sc.nextInt();
				for(int i =x-d;i<=x+d;i++){
					for(int j=y-d;j<=y+d;j++){
						if(i>=0 && i<1025 && j>=0 && j<1025){
							killed[i][j] += p;
						}
					}
				}
			}
			int X = -1;
			int Y = -1;
			int max = -1;
			for(int i=0;i<1025;i++)
			{
				for(int j=0;j<1025;j++){
					if(killed[i][j]>max){
						max =killed[i][j];
						X= i;
						Y =j;
					}
				}
			}
			System.out.printf("%d %d %d\n",X,Y,max);
		}
		sc.close();
	}
}
