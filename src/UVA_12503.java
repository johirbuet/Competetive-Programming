import java.util.ArrayList;
import java.util.Scanner;

public class UVA_12503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++){
			int N = Integer.parseInt(sc.nextLine());
			ArrayList<String> ins =new ArrayList<>();
			int init = 0;
			for(int j =0; j<N;j++){
				String in =sc.nextLine();
				if(in.equals("LEFT")){
					init--;
					ins.add(in);
				}
				else if(in.equals("RIGHT")){
					init++;
					ins.add(in);
				}
				else
				{
					String [] strs = in.split("\\s+");
					int ind =Integer.parseInt(strs[2]);
					String inst = ins.get(ind-1);
					if(inst.equals("LEFT")){
						ins.add("LEFT");
						init--;
					}
					else
					{
						ins.add("RIGHT");
						init++;
					}
				}
			}
			System.out.println(init);
			
		}
		sc.close();
	}
}
