package night_test;

public class First {
public static void main(String[] args)
{
	String a="VINIT AMIT";
	String[]b=a.split(" ");
	int c=b.length;
	System.out.println(c);
	String d=null;
	System.out.println(d);
	for(int e=c-1;e>=0;e--) 
	{
		d=b[e];
		System.out.println(d);
		String[]g=d.split("");
		int z=g.length;
		System.out.println(z);
		String k=null;
		System.out.println(k);
		for(int h=z-1;h>=0;h--) 
		{
			k=k+g[h];
			System.out.println(k);
			
		}System.out.println(k);
	}
}
}
