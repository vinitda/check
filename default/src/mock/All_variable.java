package mock;

public class All_variable 
{
    static int a=20;    //static variable
   
    int b=30;           //instance/non-static variable
 
 public static void main(String[] args)
 {
	 int c=40;    //local variable
	 All_variable v=new All_variable();
	 System.out.println("instance/non-static variable="+(v.b));
	 System.out.println("static variable="+All_variable.a );
	 System.out.println("call local variable="+ c);
 }
}
