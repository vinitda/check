package mock;

public class Sample_variable 
{
int a=10; //global
public void v1()
{
	int a=20;  //local
	System.out.println(this.a);    //global
	System.out.println(a);         //local
}
public void m2()
{
	int c=30;
	System.out.println(a);
	System.out.println(c);
	System.out.println(c+a);
}
public static void main(String[] args)
{
	Sample_variable s=new Sample_variable();
	s.v1();
	s.m2();
}
}
