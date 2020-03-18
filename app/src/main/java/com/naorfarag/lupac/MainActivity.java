package com.naorfarag.lupac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton newAlarmBtn;
    private VideoView videoview;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        setIds();
        setClickListeners();
        setBackground();


    }

    private void setBackground() {

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.starts);
        videoview.setVideoURI(uri);
        videoview.start();
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }

    private void setClickListeners() {

        newAlarmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,NewAlarmActivity.class);
                startActivity(intent);
                overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );
            }
        });


    }

    private void setIds()
    {
        videoview = (VideoView) findViewById(R.id.background_video);
        newAlarmBtn = (FloatingActionButton) findViewById(R.id.new_alarm);
    }
}
