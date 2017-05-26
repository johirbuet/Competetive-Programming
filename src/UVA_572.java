import java.util.Scanner;

public class UVA_572 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			String [] line =sc.nextLine().split(" ");
			int m =Integer.parseInt(line[0]);
			int n =Integer.parseInt(line[1]);
			int count  = 0;
			if(m==0 && n==0){
				break;
			}
			char [][] plot =new char[m][n];
			for(int i=0;i<m;i++)
			{
				plot[i] = sc.nextLine().toCharArray();
			}
			for(int i=0;i<m;i++)
			{
				for (int j=0;j<n;j++){
					if(plot[i][j] !='*')
					{
						DFS(plot, i, j);
						count++;
					}
				}
			}
			System.out.println(count);
			
		}
		sc.close();
	}
	
	public static void DFS(char [][] plot, int i,int j)
	{
		if(i< 0 || j< 0 || i== plot.length || j== plot[0].length)
		{
			return;
		}
		if(plot[i][j]=='*')
		{
			return;
		}
		if(plot[i][j]=='@')
		{
			plot[i][j] = '*';
		}
		
		DFS(plot, i, j+1); // 
		DFS(plot, i, j-1);
		DFS(plot, i+1, j);
		DFS(plot, i+1, j+1);
		DFS(plot, i+1, j-1);
		DFS(plot, i-1, j);
		DFS(plot, i-1, j+1);
		DFS(plot, i-1, j-1);
		
	}
}
