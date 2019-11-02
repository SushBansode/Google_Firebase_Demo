public class Demo_overload {
        public int add(int m,int n)
        {
            return m+n;
        }
        public int add(int m, int n,int o)
        {
            return m+n+o;
        }
        public int add(int m,double n)
        {
            return  m+(int)n;
        }
    }
    class PrintAdd
    {
        public static void main(String[] args) {
            Demo_overload a = new Demo_overload();
            System.out.println(a.add(2,3));
            System.out.println(a.add(2,3,4));
            System.out.println(a.add(2,3.4));
        }
    }


