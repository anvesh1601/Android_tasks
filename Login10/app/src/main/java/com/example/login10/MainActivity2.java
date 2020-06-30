package com.example.login10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
Button b1,b2;
EditText et1,et2,et3,et4;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = findViewById(R.id.button3);
        b2 = findViewById(R.id.button4);
        et1 = findViewById(R.id.editTextTextPersonName2);
        et2 = findViewById(R.id.editTextTextEmailAddress);
        et4 = findViewById(R.id.editTextTextPassword2);
        et3 = findViewById(R.id.editTextTextPassword3);
        tv= findViewById(R.id.textView6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action
                tran();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action
                tran1();
            }
        });
    }
    public void tran()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void tran1()
    {
        String name = et1.getText().toString();
        String email = et2.getText().toString();
        String pass1 = et3.getText().toString();
        String pass2 = et4.getText().toString();
        if(et4.getText().toString().equals(pass1)) {

            Intent intent1=new Intent(this,MainActivity3.class);
            intent1.putExtra("username",name);
            startActivity(intent1);
            Toast.makeText(this,"Welcome"+name,Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(getApplicationContext(), "Confirm Password didn't match with Password", Toast.LENGTH_LONG).show();
            tv.setText("Confirm Password didn't match with Password");
        }

    }
}