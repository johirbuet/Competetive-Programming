import java.util.Scanner;
/**
 * {@link https://icpcarchive.ecs.baylor.edu/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=24&problem=53&mosmsg=Submission+received+with+ID+2172850}
 * @author johir
 *
 */
public class LA_2052 {

	public static void main(String[] args) {
		int [][] point = new int[5001][5001];
		int start =0;
		int step =1;
		for(int i=0;i<5001;i++)
		{
			for(int j=0;j<5001;j++)
			{
				point[i][j] =-1;
			}
		}
		for(int i=0;i<5001;i++)
		{
			point[i][i] = start;
			start =start +step;
			if(step==3)
			{
				step=1;
			}
			else
			{
				step =3;
			}
		}
		start =2;
		step =1;
		for(int i=2;i<5001;i++)
		{
			point[i][i-2] =start;
			start =start + step;
			if(step==3)
			{
				step=1;
			}
			else
			{
				step =3;
			}
		}
		
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int x =sc.nextInt();
			int y=sc.nextInt();
			if(point[x][y]>=0)
			{
				System.out.println(point[x][y]);
			}
			else
			{
				System.out.println("No Number");
			}
		}
		sc.close();
	}

}
