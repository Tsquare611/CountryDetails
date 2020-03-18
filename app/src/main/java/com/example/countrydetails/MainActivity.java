package com.example.countrydetails;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button bangladeshButton,indiaButton,pakistanButton;
private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       bangladeshButton =(Button) findViewById(R.id.button1Id);
        indiaButton=(Button)findViewById(R.id.button2Id);
        pakistanButton=(Button)findViewById(R.id.button3Id);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button1Id){
           intent =new Intent(MainActivity.this,SecondActivity.class);
           intent.putExtra("name","bangladesh");
           startActivity(intent);
        }
        if (v.getId()==R.id.button2Id){
            intent =new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if (v.getId()==R.id.button3Id){
            intent =new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setIcon(R.drawable.ques);
        alertDialogBuilder.setTitle(R.string.title_txt);
        alertDialogBuilder.setMessage(R.string.message_txt);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             dialog.cancel();
            }
        });
        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
    }
