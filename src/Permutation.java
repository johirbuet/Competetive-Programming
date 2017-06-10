import java.util.TreeSet;

public class Permutation {
	public static void main(String[] args) {
		String s ="abc";
		char [] cr = s.toCharArray();
		TreeSet<String> set =new TreeSet<>();
		permute(cr,set,0,cr.length-1);
		for (String string : set) {
			System.out.println(string);
		}
	}
	
	
	public static void permute(char [] cr,TreeSet<String> set,int a,int b){
		if(a==b){
			set.add(String.valueOf(cr));
			return;
		}
		for(int i=a;i<=b;i++){
			char t = cr[i];
			cr[i] = cr[a];
			cr[a] =t;
			permute(cr, set, a+1, b);
			t = cr[i];
			cr[i] = cr[a];
			cr[a] =t;
		}
	}
}
