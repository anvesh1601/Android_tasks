package com.example.implicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        et=findViewById(R.id.editTextTextPersonName);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action
                tran();
            }
        });
    }

    public void tran()
    {
        String s=et.getText().toString();

        Intent sI = new Intent();
        sI.setAction(Intent.ACTION_SEND);
        sI.putExtra(Intent.EXTRA_TEXT, s);
        sI.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sI, null);
        startActivity(shareIntent);
    }
}