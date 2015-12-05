package com.example.xunnam.fragmenttesting.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xunnam.fragmenttesting.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XuânNam on 11/30/2015.
 */
public class FloorRecycleViewAdapter extends RecyclerView.Adapter<FloorRecycleViewAdapter.FloorViewHolder> {
    List<String>items=new ArrayList<String>();
    public FloorRecycleViewAdapter(){
        initializeData();
    }
    private void initializeData(){
        items.add("First Floor");
        items.add("Second Floor");
    }
    public static class FloorViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView nameFloorTextView;
        public FloorViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.floor_card_view);
            nameFloorTextView=(TextView)itemView.findViewById(R.id.card_view_text);
        }
    }
    @Override
    public FloorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.floor_item_card_view,parent,false);
        FloorViewHolder holder=new FloorViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(FloorViewHolder holder, int position) {
        holder.nameFloorTextView.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
