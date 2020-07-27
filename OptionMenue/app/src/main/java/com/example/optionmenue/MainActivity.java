package com.example.optionmenue;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public static final int crc = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.share:
                share();
                break;
            case R.id.dail:
                dail();
                break;
            case R.id.gallery:
                gallery();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void share() {
        String s="Sharable Text";

        Intent sI = new Intent();
        sI.setAction(Intent.ACTION_SEND);
        sI.putExtra(Intent.EXTRA_TEXT, s);
        sI.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sI, null);
        startActivity(shareIntent);
    }
    private void dail() {

        Intent in=new Intent();
        in.setAction(Intent.ACTION_DIAL);
        in.setData(Uri.parse("tel:+919959183982"));
        startActivity(in);


    }
    private void gallery() {
        Intent in=new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(in,crc);
    }


}