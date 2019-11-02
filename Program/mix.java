class One {
    public void display()
    {
        System.out.println("one");
    }
}
    class Two extends One{
        public void dispaly(){
            System.out.println("two");
        }
        public int add(int x,int y){
            return x+y;
        }
        public double add(double x,double y){
            return x+y;
        }
    }
    class EncapTest{
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String newName){
            name=newName;

        }
        abstract class twowheeler{
            public abstract void run();

        }
        class Honda extends twowheeler{
            public void run() {
                System.out.println("Bike is running");
            }
            }
        }
    }

public class MainClass {
    public static void main(String[] args) {
        One a=new One();

        a.display();
        One.Two b =new One.Two();
        b.display();
        System.out.println(b.add(4,2));
        System.out.println(b.add(5.,2.));
        One.EncapTest encap=new One.EncapTest();
        encap.setName("Sandeep's");
        System.out.println("Name :"+encap.getname());
        twowheeler test = new 
        test.run();
    }
}
