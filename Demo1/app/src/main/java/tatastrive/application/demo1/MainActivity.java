package tatastrive.application.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,fact,SI,navbutton;
    TextView textView;
    EditText editText,editText2,editText3;
    String str,str1,str2;

    private Button addition;
    //private Button fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById( R.id.button);
        textView=findViewById( R.id.textView );
        editText=findViewById( R.id.editText);
        editText2=findViewById( R.id.editText2 );
        editText3=findViewById( R.id.editText3 );
        addition=findViewById( R.id.button4 );
        fact=findViewById( R.id.button3);
        navbutton=findViewById( R.id.button2 );
        SI=findViewById( R.id.button );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setTextColor( getResources().getColor( R.color.colorAccent ) );
                textView.setTextSize( 48 );

              /*  String str=editText.getText().toString().trim();
                int r=Integer.parseInt( str );
                int fact=1;
                while(r!=0)
                {
                    fact=fact*r;
                    r--;
                }
                textView.setText(String.valueOf( fact ));*/
                Toast.makeText( MainActivity.this, "Hiii Akshay ", Toast.LENGTH_SHORT ).show();
                Toast.makeText( MainActivity.this, "Enter value is"+str, Toast.LENGTH_SHORT ).show();
                chalhat();
            }
        } );

        addition.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str=editText.getText().toString().trim();
                int r1=Integer.parseInt( str );

                str1=editText2.getText().toString().trim();
                int r2=Integer.parseInt( str1 );

                int c;
                c=r1+r2;
                Toast.makeText( MainActivity.this, "addition"+c, Toast.LENGTH_SHORT ).show();
            }
        } );
        fact.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Click Button", Toast.LENGTH_SHORT ).show();
                str=editText.getText().toString().trim();
                int r=Integer.parseInt( str );
                int fact=1;
                while(r!=0)
                {
                    fact=fact*r;
                    r--;
                }
                textView.setText(String.valueOf( fact ));
                Toast.makeText( MainActivity.this, "Enter the value", Toast.LENGTH_SHORT ).show();

            }
        } );

        SI.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=editText.getText().toString().trim();
                int r=Integer.parseInt( str );

                str1=editText2.getText().toString().trim();
                int r1=Integer.parseInt( str1 );

                str2=editText3.getText().toString().trim();
                int r2=Integer.parseInt( str2 );

                float b=(r*r1*r2)/100;

                textView.setText( String.valueOf( b ) );
                Toast.makeText( MainActivity.this, "Simple interst is"+b, Toast.LENGTH_SHORT ).show();
            }
        } );
        navbutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( MainActivity.this,SecondActivity.class);
                startActivity(intent);
                chalhat();
            }
        } );

    }

 

    private void chalhat() {
        AlertDialog.Builder builder=new AlertDialog.Builder( this );
        builder.setMessage( "Party is on" );
        builder.setTitle( "welcome to hell" );
        builder.setCancelable( true );
        builder.setIcon( R.mipmap.ic_launcher_round );
        builder.show();
    }
}
