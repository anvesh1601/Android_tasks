package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
EditText et1,et2,et3,et4,et5,et6;
RadioButton r1,r2;
CheckBox c1,c2,c3,c4;
Button b1;
    String[] Branch = { "CSE", "ECE", "EEE", "MECH", "Other"};
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName3);
        et3=findViewById(R.id.editTextPhone);
        et4=findViewById(R.id.editTextTextEmailAddress);
        et5=findViewById(R.id.editTextTextPassword);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);
        spin = (Spinner) findViewById(R.id.branch_spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Branch);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action
                tran1();
            }
        });



    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
s1=Branch[i];
        Toast.makeText(getApplicationContext(),Branch[i] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void genderSelect(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    s10=r1.getText().toString();
                    break;
            case R.id.radioButton2:
                if (checked)
                    s10=r2.getText().toString();;
                    break;
        }
    }
    public void tran1()
    {
        String name = et1.getText().toString();
        String pass = et5.getText().toString();
        s2=et2.getText().toString();
        s3=et3.getText().toString();
        s4=et4.getText().toString();

            Intent intent1=new Intent(this,MainActivity2.class);
            intent1.putExtra("roll no",name);
            intent1.putExtra("name",s2);
            intent1.putExtra("phone number",s3);
            intent1.putExtra("mail",s4);
            intent1.putExtra("password",pass);
            intent1.putExtra("gender",s10);
            intent1.putExtra("Branch",s1);


            startActivity(intent1);
            Toast.makeText(this,"Welcome"+name,Toast.LENGTH_SHORT).show();





    }
}