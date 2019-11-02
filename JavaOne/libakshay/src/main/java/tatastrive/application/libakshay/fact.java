package tatastrive.application.libakshay;

public class fact {
    public static void main(String[] args) {
        int i, fact = 1;
        int n = 5;
        while(n!=0) {
            System.out.println( "before\t" + fact + "\tn\t" + n );
            fact = fact * n;
            System.out.println( "after\t" + fact + "\tn\t" + n );
            n--;
        }
        System.out.println( "factorial number is " + n + "\n fact" + fact );
    }
}