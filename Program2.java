public class Program2 
{
	public static void main(String[] args) 
	{
		String s="Think Twice";
		String a[]=s.split(" ");
		String b[]=new String[a.length];
		for(int i=0; i<a.length;i++)
		{
			StringBuilder pre=new StringBuilder(a[i]);
			String z= new String(pre.reverse());
			b[i]=z;
		}
		String z=String.join(" ", b);
		System.out.println(z);
	}

}
