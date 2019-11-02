package tatastrive.application.google_firebase_demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private Button btnChangeEmail, btnChangePassword,
            btnSendResetEmail, btnRemoveUser, changeEmail,
            changePassword, sendEmail, remove, signOut;

    private EditText oldEmail, newEmail, password, newPassword;
    private ProgressBar progressBar;
    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //get firebase auth instance
        auth = FirebaseAuth.getInstance();

        //get current user
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    //user auth state is change - user is null
                    //launch login activity
                    startActivity( new Intent( MainActivity.this, LoginActivity.class ) );
                    finish();
                }
            }
        };

        btnChangeEmail= findViewById( R.id.change_email_button );
        btnChangePassword= findViewById( R.id.change_password_button );
        btnSendResetEmail= findViewById( R.id.sending_pass_reset_button );
        btnRemoveUser= findViewById( R.id.remove_user_button );
        changeEmail=findViewById( R.id.changeEmail );
        changePassword=findViewById( R.id.changePass );
        sendEmail=findViewById( R.id.send );
        remove=findViewById( R.id.remove );
        signOut=findViewById( R.id.sign_out );

        oldEmail=findViewById( R.id.old_email );
        newEmail=findViewById( R.id.new_email );
        password=findViewById( R.id.password );
        newPassword=findViewById( R.id.newPassword );

        oldEmail.setVisibility( View.GONE );
        newEmail.setVisibility( View.GONE );
        password.setVisibility( View.GONE );
        newPassword.setVisibility( View.GONE );
        changeEmail.setVisibility( View.GONE );
        changePassword.setVisibility( View.GONE );
        sendEmail.setVisibility( View.GONE );
        remove.setVisibility( View.GONE );

        progressBar=findViewById( R.id.progressBar );

        if(progressBar!=null){
            progressBar.setVisibility( View.GONE );
        }
        btnChangeEmail.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oldEmail.setVisibility( View.GONE );
            }
        } );

    }
}
