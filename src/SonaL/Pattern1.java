package SonaL;

public class Pattern1 {
	
	static void starPattern(int num)
	{
		for(int i =1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2 == 0)
				{
					System.out.print("# ");
				}else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
			starPattern(4);
	}

}