package tatastrive.application.libakshay;

class A
{
    static int a=10,b=20,c;
}
class B extends A
{
   void add(){
       c=a+b;
   }
}
class C extends B
{
    void priit(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        C cc=new C();
        cc.add();
        cc.priit();
    }

}
