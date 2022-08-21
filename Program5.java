import java.util.Scanner;

public class Program5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string to count repeated characters in the String");
		String s=sc.next();
		char[] array=s.toCharArray();
		for(char i:array)
		{
			int count=0;
			for(char j:array)
			{
				if(i==j)
				{
					count=count+1;
				}
			}
			if(count>1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
