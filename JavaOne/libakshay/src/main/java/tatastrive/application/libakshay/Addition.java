package tatastrive.application.libakshay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Addition {


    public static void main(String[] args) throws IOException {
        String input;
        int x, y;
        Scanner scanner=new Scanner( System.in );

        InputStreamReader inputStreamReader = new InputStreamReader( System.in );
        BufferedReader bufferedReader = new BufferedReader( inputStreamReader );
        System.out.println( "Enter value of x" );
        try {
//            x = Integer.parseInt( bufferedReader.readLine() );
            x=scanner.nextInt();
            System.out.println( "Enter value of y" );
//            y = Integer.parseInt( bufferedReader.readLine());
            y=scanner.nextInt();
            System.out.println( "addition of x and y " + (x + y) );
        }catch (Exception e){

        }
    }
}

