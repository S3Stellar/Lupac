package com.naorfarag.lupac;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewAlarmActivity extends AppCompatActivity {

    private Button randomBtn;
    private Button newSongBtn;
    private Button libraryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_alarm);
        setIds();
        setClickListeners();
    }

    private void setClickListeners() {

        randomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePickBtn(randomBtn);
            }
        });

        newSongBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePickBtn(newSongBtn);
            }
        });

        libraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePickBtn(libraryBtn);
            }
        });


    }

    private void changePickBtn(Button btn) {

        //Reset all button to unpicked shape
        randomBtn.setBackgroundResource(R.drawable.btn_unpicked_shape);
        newSongBtn.setBackgroundResource(R.drawable.btn_unpicked_shape);
        libraryBtn.setBackgroundResource(R.drawable.btn_unpicked_shape);

        randomBtn.setTextColor(Color.rgb( 117, 185,246));
        newSongBtn.setTextColor(Color.rgb( 117, 185,246));
        libraryBtn.setTextColor(Color.rgb( 117, 185,246));

        //Set the picked btn as picked
        btn.setBackgroundResource(R.drawable.btn_picked_shape);
        btn.setTextColor(Color.WHITE);


    }

    private void setIds() {

        randomBtn = findViewById(R.id.random_btn);
        newSongBtn = findViewById(R.id.new_song_btn);
        libraryBtn = findViewById(R.id.library_btn);
    }
}
