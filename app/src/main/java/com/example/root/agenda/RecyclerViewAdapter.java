package com.example.root.agenda;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Contact> mData;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_contact_layout, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_contact_name.setText(mData.get(position).getNombre());
        holder.img_contact_thumbnail.setImageResource(mData.get(position).getThumbnail());

        //Click Listener
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_contact_name;
        ImageView img_contact_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_contact_name = (TextView) itemView.findViewById(R.id.id_contact_name);
            img_contact_thumbnail = (ImageView) itemView.findViewById(R.id.id_contact_img);
            cardView = (CardView) itemView.findViewById(R.id.id_cardview);
        }
    }
}
