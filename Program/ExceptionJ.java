 import java.util.*;
import java.io.*;

public class ExceptionJ {
public static void main(String args[])
{
int a=0,b=0,res;

Scanner input=new Scanner(System.in);

System.out.println("Type two numbers:");

a=input.nextInt();
b=input.nextInt();

try{

if(a<0 ||b<0){
}


}

catch(Exception ex){
System.out.println("Invalid Input");
}

res=a+b;
System.out.println("Addition:" +res);



}

}