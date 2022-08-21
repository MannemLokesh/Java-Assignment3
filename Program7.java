import java.util.Scanner;

public class Program7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		String pre=s.toLowerCase();
		int vovels=0;
		int conso=0;
		for(int i=0;i<pre.length();i++)
		{
			
			if(pre.charAt(i)=='a' || pre.charAt(i)=='e' || pre.charAt(i)=='i'
					|| pre.charAt(i)=='o' || pre.charAt(i)=='u')
			{
				vovels=vovels+1;
			}
			else
			{
				conso=conso+1;
			}
		}
		System.out.println("vowels : "+vovels);
		System.out.println("Consonants : "+conso);
	}

}
