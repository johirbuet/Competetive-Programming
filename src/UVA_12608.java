import java.util.Scanner;

public class UVA_12608 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int t=0;t<T;t++){
			long W =sc.nextLong();
			long N =sc.nextLong();
			 long curWeight = 0 , Cost = 0 ;
			 long DistFromDump =0,Weight =0;
		        for(int i=0;i<N;i++) {
		            DistFromDump =sc.nextLong();
		            Weight =sc.nextLong();
		            if( curWeight + Weight == W ) {
		                curWeight = 0 ;
		                Cost += 2 * DistFromDump ;
		            }
		            else if( curWeight + Weight > W ) {
		                curWeight = Weight;
		                Cost += 2 * DistFromDump ;
		            }
		            else curWeight += Weight;
		        }
		        if( curWeight !=0 )  Cost += 2 * DistFromDump ;
			System.out.println(Cost);
		}
		sc.close();
	}
}
