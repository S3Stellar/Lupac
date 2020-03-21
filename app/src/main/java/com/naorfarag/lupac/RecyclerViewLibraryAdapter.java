package com.naorfarag.lupac;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewLibraryAdapter extends RecyclerView.Adapter<RecyclerViewLibraryAdapter.MyViewHolder> {

    private Context mContext;
    private List<Song> mData;

    public RecyclerViewLibraryAdapter(Context mContext, List<Song> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_song,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_song_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());

        setClickListeners(holder,position);


    }

    private void setClickListeners(MyViewHolder holder,int position) {

        //Set click listeners
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,SongActivity.class);

                //passing data to the song activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

                //Start the activity
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_song_title;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_song_title = (TextView) itemView.findViewById(R.id.song_title_id);
            img_book_thumbnail = (ImageView)itemView.findViewById(R.id.song_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
