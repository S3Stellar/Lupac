package com.naorfarag.lupac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    private TextView tvTitle;
    private TextView tvGenre;
    private TextView tvDescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        setIds();
        handleReceiveData();


    }

    private void handleReceiveData() {

        //Recieve data
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("description");
        int image = intent.getExtras().getInt("Thumbnail");

        //Settings values
        tvTitle.setText(title);
        tvDescription.setText(description);
        img.setImageResource(image);
    }

    private void setIds() {

        tvTitle = (TextView)findViewById(R.id.txt_title);
        tvGenre = (TextView)findViewById(R.id.txt_genre);
        tvDescription = (TextView)findViewById(R.id.txt_decs);
        img = (ImageView)findViewById(R.id.songthumbnail);


    }
}
