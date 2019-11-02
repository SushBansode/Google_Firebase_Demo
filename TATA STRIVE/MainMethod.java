 class ConstructDemo {
    int c;
    int x,y;

   /* ConstructDemo(){
        System.out.println("addition"+c);

    }*/
    ConstructDemo(int a,int b)
    {
        x=a;
        y=b;
    }
    void add()
    {
        c=x+y;
        System.out.println("Addition is " +c);
    }


    }
    public class MainMethod {
    public static void main(String[] args) {
        ConstructDemo c1 = new ConstructDemo(10, 15);

        c1.add();

    }
}
