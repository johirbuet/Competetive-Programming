import java.util.Scanner;

public class UVA_594 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int a =sc.nextInt();
			int t = a;
			int y =0;
			for(int i=0;i<32;i++){
				if((a & 1<<i) !=0) y |= 1<<((3-i/8)*8 + (i%8));
				System.out.println(y);
				//a = a>>1;
			}
			System.out.printf("%d converts to %d\n",t,y);
		}
		sc.close();
	}
}
