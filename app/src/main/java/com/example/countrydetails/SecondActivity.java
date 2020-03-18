package com.example.countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private ImageView imageView;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView=(ImageView)findViewById(R.id.imageViewId);
        textView=(TextView)findViewById(R.id.textViewId);

        Bundle bundle= getIntent().getExtras();
        if (bundle!=null){
            String countryName = bundle.getString("name");
            showDetails(countryName);

        }

    }
void showDetails(String countryName){
    if(countryName.equals("bangladesh")){
        imageView.setImageResource(R.drawable.img3);
        textView.setText(R.string.Bangaldesh_text);
    }
    if(countryName.equals("india")){
        imageView.setImageResource(R.drawable.img2);
        textView.setText(R.string.India_text);
    }
    if(countryName.equals("pakistan")){
        imageView.setImageResource(R.drawable.img1);
        textView.setText(R.string.Pakistan_txt);
    }

}

}
