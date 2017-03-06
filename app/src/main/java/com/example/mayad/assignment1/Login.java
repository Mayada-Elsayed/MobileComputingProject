package com.example.mayad.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText name = (EditText) findViewById(R.id.uname);
        final EditText pass = (EditText) findViewById(R.id.password);
        final Button login = (Button) findViewById(R.id.login);
        final TextView regtxt = (TextView) findViewById(R.id.regtxt);

        regtxt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regIntent = new Intent(Login.this,Register.class);
                Login.this.startActivity(regIntent);
            }
        });

        assert login != null;
        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this ,"Logged in successfully!",Toast.LENGTH_LONG).show();
            }
        });




    }
}
