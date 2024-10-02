import java.util.Scanner;
class Question10
{
	public static void main(String[] args)
	{
		System.out.println("Running");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = input.nextInt();
		input.close();
		
		for(int i = 1; i <=n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}