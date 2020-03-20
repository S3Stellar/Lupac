package com.naorfarag.lupac;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SongsLibraryFragment extends Fragment {
    private View rootView;
    public SongsLibraryFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.fragment_songs_library, container, false);
        setRetainInstance(true);
        //onWindowFocusChanged();

        Button buttonInFragment2 = rootView.findViewById(R.id.button_1);
        buttonInFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Button in library fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

   /* public void onWindowFocusChanged() {
        rootView.getViewTreeObserver().addOnWindowFocusChangeListener(hasFocus -> {
            if (hasFocus) {
                getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
                //LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES - for notch with custom color
            }
        });
    }*/
}
