package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
String s1,s2,s3,s4,s5,s6,s7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView4);
        s1=getIntent().getStringExtra("roll no");
        s2=getIntent().getStringExtra("name");
        s3=getIntent().getStringExtra("phone number");
        s4=getIntent().getStringExtra("mail");
        s5=getIntent().getStringExtra("password");
        s6=getIntent().getStringExtra("gender");
        s7=getIntent().getStringExtra("Branch");
        tv.setText(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s7);

    }
}