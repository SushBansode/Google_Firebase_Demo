package tatastrive.application.libakshay;


class x{
    int no=6;

}

class y extends x{
   int i,fact=1;
   public void process(){
       for(i=1;i<=no;i++){
           fact=fact*i;
       }
       System.out.println("fact="+fact);
  }
}
public class SingleI {
    public static void main(String[] args) {
        y yy=new y();
        yy.process();

    }

}
