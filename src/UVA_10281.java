import java.util.Scanner;

public class UVA_10281 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String prevtime ="00:00:00";
		double prev_dist = 0;
		double newSpeed= 0;
		double currentDist =0;
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			if(line ==null || line.isEmpty())
			{
				break;
			}
			String [] params =line.split("\\s+");
			if(params.length == 1 )
			{
				int diff = seconds(prevtime, params[0]);
				prevtime = params[0];
				currentDist += diff * newSpeed;
				System.out.printf("%s %.2f km\n",prevtime,currentDist);
			}
			else if(params.length == 2)
			{
				int diff = seconds(prevtime, params[0]);
				double s =Double.parseDouble(params[1])/3600.0;
				currentDist += diff* newSpeed;
				newSpeed =s;
				prevtime = params[0];
			}
		}
		
	}
	
	public static int seconds(String from, String to)
	{
		String [] time1 =from.split(":");
		int start = Integer.parseInt(time1[0])*3600+Integer.parseInt(time1[1])*60+Integer.parseInt(time1[2]);
		String [] time2= to.split(":");
		int end = Integer.parseInt(time2[0])*3600+Integer.parseInt(time2[1])*60+Integer.parseInt(time2[2]);
		return end -start;

	}

}
