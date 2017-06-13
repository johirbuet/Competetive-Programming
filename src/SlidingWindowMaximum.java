import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		int [] a = {1,3,-1,-3,5,3,6,7};
		int k =3;
		int [] r = maxslide(a, k);
		for (int i : r) {
			System.out.println(i);
		}
	}
	
	static int [] maxslide(int [] a,int k){
		int [] r =  new int[a.length - k + 1];
		Deque<Integer> dq =new ArrayDeque<>();
		int ri =0;
		// Adding elements  i,
		for(int i=0;i<a.length;i++){
			
			while(!dq.isEmpty() && dq.peek() < i - k +1){
				dq.poll();
			}
			while(!dq.isEmpty() && a[dq.peek()]<a[i]){
				dq.poll();
			}
			dq.offer(i);
			if(i>=k-1){
				r[ri++] = a[dq.peek()];
			}
		}
		return r;
	}
}
