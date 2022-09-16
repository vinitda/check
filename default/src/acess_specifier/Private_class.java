package acess_specifier;

public class Private_class 
{
public static void main(String[] args) 
{
Private_class x=new Private_class();
x.m1();
x.m3();
x.d();
}

static int a=33;
int b=41;
int c=a+b;
private void m1()
{
	System.out.println("m1");
	System.out.println(c);
}
protected void m3()
{
	for(int d=10;d>=3;d--)
	{
		System.out.println("$");
		System.out.println("m3");
	}
}
void d()
{
	System.out.println("d");
	System.out.println(a);
}
}
