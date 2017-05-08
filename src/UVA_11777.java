import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class UVA_11777 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		int c =0;
		for(int t=0;t<T;t++){
			c++;
			int term1 =sc.nextInt();
			int term2  =sc.nextInt();
			int fin =sc.nextInt();
			int attend =sc.nextInt();
			int ct1 =sc.nextInt();
			int ct2 =sc.nextInt();
			int ct3 =sc.nextInt();
			Integer [] a =new Integer[3];
			a[0] =ct1;
			a[1] =ct2;
			a[2] =ct3;
			Arrays.sort(a, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
			int ct =(a[0]+a[1])/2;
			int total =term1+term2+fin+attend+ct;
			if(total>=90)
			{
				System.out.printf("Case %d: %s\n",c,"A");
			}
			else if(total<90 && total>=80){
				System.out.printf("Case %d: %s\n",c,"B");
			}
			else if(total<80 && total>=70){
				System.out.printf("Case %d: %s\n",c,"C");
			}
			else if(total<70 && total>=60){
				System.out.printf("Case %d: %s\n",c,"D");
			}
			else{
				System.out.printf("Case %d: %s\n",c,"F");
			}
		}
		sc.close();
	}

}
