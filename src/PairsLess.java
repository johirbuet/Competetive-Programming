
public class PairsLess {
	public static void main(String[] args) {
		int [] a ={1,1,1,2,3,4,5};
		// k =6
		// (1,1),(1,2), (1,3), (1,4) , (1,5), (2,3) = 5
		int sum =6;
		int l = 0;
		int r =a.length-1;
		int total =0;
		while(l<r){
			if(a[l]+a[r]<sum){
				total += (r-l);
				l++;
				while(l<r && a[l]==a[l-1]){
					l++;
				}
				
			}
			else
			{
				r--;
			}
		}
		System.out.println(total);
	}
}
