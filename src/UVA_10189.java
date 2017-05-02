import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10189 {

	public static void main(String[] args) {
		char [][] board;
		Scanner sc=new Scanner(System.in);
		int cs =1;

		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			
			StringTokenizer st =new StringTokenizer(line);
			
			if(line == null || line.isEmpty() || line.equals(" "))
			{
				//sc.nextLine();
				
				continue;
			}
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if(N ==0 && M==0)
			{
				break;
			}
			if(cs>1)
			{
				System.out.println();
			}
			board =new char[N][M];
			for(int i=0;i<N;i++)
			{
				line =sc.nextLine();
				char [] c =line.toCharArray();
				for(int j=0;j<M;j++)
				{
					board[i][j] =c[j];
				}
			}
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					if(board[i][j] != '*')
					{
						int count =getAdjacentCount(board, i, j);
						board[i][j] = String.valueOf(count).toCharArray()[0];
					}
				}
			}
			System.out.printf("Field #%d:\n",cs);
			cs++;
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			
		}
	}

	public static int getAdjacentCount(char [][] board,int N,int M)
	{
		int count =0;
		if(N>0)
		{
			if(board[N-1][M]=='*')
				count++;
			if(M>0 && board[N-1][M-1]=='*')
			{
				count++;
			}
		}
		if(N< board.length-1)
		{
			if(board[N+1][M]=='*')
				count++;
			if(M< board[0].length-1 && board[N+1][M+1]=='*')
			{
				count++;
			}
		}
		if(M>0)
		{
			if(board[N][M-1]=='*')
				count++;
			
		}
		if(M < board[0].length-1)
		{
			if(board[N][M+1]=='*')
			{
				count++;
			}
		}
		if(N>0 && M < board[0].length-1)
		{
			if(board[N-1][M+1]=='*')
			{
				count++;
			}
		}
		
		if(M > 0 && N < board.length-1)
		{
			if(board[N+1][M-1]=='*')
			{
				count++;
			}
		}
		
		
		return count;
	}

}
