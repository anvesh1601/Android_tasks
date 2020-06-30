package com.example.login10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText et,et2;
String a;
TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button);
        tv=findViewById(R.id.textView7);
        et = findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPassword);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action
tran();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action
                tran1();
            }
        });
    }
        public void tran()
    {
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        }
    public void tran1()
    {
        String name = et.getText().toString();
        String pass = et2.getText().toString();
        if( et.getText().toString().equals("Anvesh")&& et2.getText().toString().equals("root")) {
            Intent intent1=new Intent(this,MainActivity3.class);
            intent1.putExtra("username",name);
            startActivity(intent1);
            Toast.makeText(this,"Welcome"+name,Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(getApplicationContext(), "check your username or password", Toast.LENGTH_LONG).show();
tv.setText("check your username or password");
        }

    }
}