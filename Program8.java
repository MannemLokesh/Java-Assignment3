import java.util.Scanner;

public class Program8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String Str=sc.next();
		String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
		int count=0;
		for (int i = 0; i < Str.length(); i++) 
		{  
		    if (specialCharacters.contains(Character.toString(Str.charAt(i))))
		    {
		        count=count+1;
		    }  
		}
		System.out.println("special character count : "+count);
	}
}
