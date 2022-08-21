import java.util.Arrays;
import java.util.Scanner;

public class Program6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a String");
		String s=sc.next();
		char[] array=s.toCharArray();
		Arrays.sort(array);
		System.out.println(new String(array));

	}

}
