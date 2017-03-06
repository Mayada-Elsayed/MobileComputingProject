package com.example.mayad.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button loginbtn = (Button) findViewById(R.id.loginbtn);
        final Button regbtn = (Button) findViewById(R.id.regbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent loginIntent = new Intent(MainActivity.this,Login.class);
                MainActivity.this.startActivity(loginIntent);
            }
        });

        regbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent regIntent = new Intent(MainActivity.this,Register.class);
                MainActivity.this.startActivity(regIntent);
            }
        });
    }
}
