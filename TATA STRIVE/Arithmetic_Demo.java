public class Arithmetic_Demo {
    int a,b,c;
        void add()
        {
            int a=10;
            int b=20;
            c=a+b;
        }
        void sub()
        {
             a=30;
             b=20;
            c=a-b;
        }
        void mul()
        {
             a=10;
             b=20;
            c=a*b;
        }
        void div()
        {
             a=20;
             b=10;
            c=a/b;
        }
        void display()
        {
            System.out.println(c);
        }
        public static void main(String args[])
    {
        Arithmetic_Demo a1 =new Arithmetic_Demo();
        a1.add();
        a1.display();
        Arithmetic_Demo a2 =new Arithmetic_Demo();
        a2.sub();
        a2.display();
        Arithmetic_Demo a3=new Arithmetic_Demo();
        a3.mul();
        a3.display();
        Arithmetic_Demo a4=new Arithmetic_Demo();
        a4.div();
        a4.display();



    }


}
