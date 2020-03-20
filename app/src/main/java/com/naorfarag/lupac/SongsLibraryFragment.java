package com.naorfarag.lupac;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SongsLibraryFragment extends Fragment {

    public SongsLibraryFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_songs_library, container, false);
        Button buttonInFragment2 = rootView.findViewById(R.id.button_1);
        buttonInFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Button in library fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
