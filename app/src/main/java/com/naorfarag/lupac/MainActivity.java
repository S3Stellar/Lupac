package com.naorfarag.lupac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton newAlarmBtn;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        setIds();
        setClickListeners();






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

    private void setIds() {
        newAlarmBtn = (FloatingActionButton) findViewById(R.id.new_alarm);
    }
}
