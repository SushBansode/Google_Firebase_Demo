import java.util.*;
import java.io.*;


 interface  interfaceA
{

public void add(int a,int b);

}

 interface interfaceB 
{

public void add(int a,int b);

}

 class classC implements interfaceA , interfaceB{

int a,b,res;

public void add(int a,int b)
{
res =a+b;

}

public void display()
{
System.out.println("Addition:" +res);
}
}


public class classD extends classC
{
public static void main(String args[])
{
classD d=new classD();
d.add(10,15);
d.display();


}

}