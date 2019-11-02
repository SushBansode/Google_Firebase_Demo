import java.util.*;
public class  
{

                   int a,b, c;

                   void getdata(int x, int y)
                   {
                      a=x;
                      b=y;
                   }

	void add()
	{
	c=a+b;
	System.out.println("Addition is =" +c);
	}
	
	void sub()
	{
	c=a-b;
	System.out.println("Substraction is =" +c);
	}

	void mul()
	{
	c=a*b;
	System.out.println("Multiplication is =" +c);
	}

	void div()
	{
	c=a/b;
	System.out.println("Division is =" +c);
	}


}

public class MainMethod
{
public static void main(String args[])
{
MainMethod m=new MainMethod();
m.getdata(10,15);
m.add();
m.sub();
m.mul();
m.div();

}
}

