import java.util.Scanner;

public class UVA_12554 {
	public static void main(String[] args) {
		String [] words ={
		        "Happy", "birthday", "to", "you", "Happy", "birthday", "to", "you"
		        , "Happy", "birthday", "to", "Rujia", "Happy", "birthday", "to", "you"
		    };
		Scanner sc =new Scanner(System.in);
		int N =Integer.parseInt(sc.nextLine());
		String [] names =new String[N];
		for(int i=0;i<N;i++){
			names[i] =sc.nextLine();
		}
		sc.close();
		int w =0;
		int n =0;
		boolean allused =false;
		while(true){
			System.out.printf("%s: %s\n",names[n],words[w]);			
			n = (n+1)%N;
			w = (w+1)%16;
			if(n==0)
			{
				allused =true;
			}
			if(allused && w == 0)
			{
				break;
			}
		}
	}
}
