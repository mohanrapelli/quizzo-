package com.example.pratice2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pratice2.Itemclicklistner;
import com.example.pratice2.R;
import com.example.pratice2.Itemclicklistner;
import com.example.pratice2.model.wwemodel;

import java.util.List;

public class mycustomadapter extends RecyclerView.Adapter<mycustomadapter.wweviewholder> {
    List<wwemodel> wwemodelList;
  static Itemclicklistner itemclicklistner;


    public void Itemclicklistner(Itemclicklistner itemclicklistner) {
        this.itemclicklistner = itemclicklistner;
    }

    public mycustomadapter(List<wwemodel> wwemodelList) {

        this.wwemodelList = wwemodelList;
    }

    @NonNull
    @Override
    public mycustomadapter.wweviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new wweviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.wweviewholder holder, int position) {
        wwemodel wwemodel=wwemodelList.get(position);
       holder.playername.setText(wwemodel.getPlayername());
       holder.playerrating.setText(String.valueOf(wwemodel.getPlayerrating()));
       holder.playerimage.setImageResource(wwemodel.getImageview());

    }

    @Override
    public int getItemCount() {
        return wwemodelList.size();
    }
    public static class wweviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView playerimage;
        TextView playername,playerrating;

        public wweviewholder(@NonNull View itemView) {
            super(itemView);
            playerimage=itemView.findViewById(R.id.image);
            playername=itemView.findViewById(R.id.name);
            playerrating=itemView.findViewById(R.id.rating);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
        if(itemclicklistner != null){
            itemclicklistner.onclick(v,getAdapterPosition());

        }

        }
    }
}
