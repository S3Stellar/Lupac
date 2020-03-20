package com.naorfarag.lupac;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private FloatingActionButton newAlarmBtn;
    private VideoView videoview;
    private View rootView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        setRetainInstance(true);
        //onWindowFocusChanged();

        setIds();
        setAddAlarmListener(newAlarmBtn);
        setBackground();
        return rootView;
    }

    private void setAddAlarmListener(FloatingActionButton newAlarmBtn) {
        newAlarmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NewAlarmActivity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "In new alarm activity", Toast.LENGTH_SHORT).show();
                Objects.requireNonNull(getActivity()).overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
            }
        });
    }

    private void setBackground() {
        Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + rootView.getResources()
                .getIdentifier("raw/starts", null, rootView.getContext().getPackageName()));
        videoview.setVideoURI(uri);
        videoview.start();
        videoview.setOnPreparedListener(mp -> mp.setLooping(true));
    }

    private void setIds() {
        videoview = rootView.findViewById(R.id.background_video);
        newAlarmBtn = rootView.findViewById(R.id.new_alarm);
    }


    /*public void onWindowFocusChanged() {
        rootView.getViewTreeObserver().addOnWindowFocusChangeListener(hasFocus -> {
            if (hasFocus) {
                getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                //LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES - for notch with custom color
            }
        });
    }*/
}
