package com.naorfarag.lupac;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SongsLibraryFragment extends Fragment {

    private View rootView;
    List<Song> lstSong;

    public SongsLibraryFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.fragment_songs_library, container, false);


        lstSong = new ArrayList<>();
        //Songs Added staticaly for test, need to be replace dynamically after we finish Spotify connection
        lstSong.add(new Song("Album 1","Category Song","Description Song",R.drawable.album1));
        lstSong.add(new Song("Album 2","Category Song","Description Song",R.drawable.album2));
        lstSong.add(new Song("Album 3","Category Song","Description Song",R.drawable.album3));
        lstSong.add(new Song("Album 4","Category Song","Description Song",R.drawable.album4));
        lstSong.add(new Song("Album 1","Category Song","Description Song",R.drawable.album1));
        lstSong.add(new Song("Album 2","Category Song","Description Song",R.drawable.album2));
        lstSong.add(new Song("Album 3","Category Song","Description Song",R.drawable.album3));
        lstSong.add(new Song("Album 4","Category Song","Description Song",R.drawable.album4));
        lstSong.add(new Song("Album 1","Category Song","Description Song",R.drawable.album1));
        lstSong.add(new Song("Album 2","Category Song","Description Song",R.drawable.album2));
        lstSong.add(new Song("Album 3","Category Song","Description Song",R.drawable.album3));
        lstSong.add(new Song("Album 4","Category Song","Description Song",R.drawable.album4));


        RecyclerView myrv = rootView.findViewById(R.id.recyclerview_id);
        RecyclerViewLibraryAdapter myAdapter = new RecyclerViewLibraryAdapter(rootView.getContext(),lstSong);
        myrv.setLayoutManager(new GridLayoutManager(rootView.getContext(),2));
        myrv.setAdapter(myAdapter);





        setRetainInstance(true);
        //onWindowFocusChanged();

//        Button buttonInFragment2 = rootView.findViewById(R.id.button_1);
//        buttonInFragment2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(), "Button in library fragment", Toast.LENGTH_SHORT).show();
//            }
//        });

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
