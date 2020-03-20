package com.naorfarag.lupac;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);


        FloatingActionButton newAlarmBtn = rootView.findViewById(R.id.new_alarm);

        newAlarmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NewAlarmActivity.class);
                startActivity(intent);
                Toast.makeText(getContext(), "In new alarm activity", Toast.LENGTH_SHORT).show();
                getActivity().overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
            }
        });


        return rootView;
    }
}
