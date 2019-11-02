package tatastrive.application.libakshay;

public class Factroial {
    public static void main(String[] args) {
        int i,fact=1;
        int number=5;
        for(i=1;i<=number;i++){
            System.out.println("before\t"+fact+"\ti\t"+i);
            fact=fact*i;
            System.out.println("after\t"+fact+"\ti\t"+i);

        }
        System.out.println("factorial number is "+number+ "\n fact"+fact);
    }
}
