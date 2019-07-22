package com.example.multiplelayoutrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter {

    private Context context;
    private Model[] data;

    public MyAdapter(Context context, Model[] models) {
        this.context = context;
        this.data = models;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());

        switch (viewType)
        {
            case 1:
                View view1=layoutInflater.inflate(R.layout.left_msg,parent,false);
                viewHolder=new Type1ViewHolder(view1);
                break;
            case 2:
                View view2=layoutInflater.inflate(R.layout.right_msg,parent,false);
                viewHolder=new Type2ViewHolder(view2);
                break;
            default: View view3=layoutInflater.inflate(R.layout.left_msg,parent,false);
                viewHolder=new Type1ViewHolder(view3);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType())
        {
            case 1:
                Type1ViewHolder type1ViewHolder=(Type1ViewHolder)holder;
                type1ViewHolder.ConfigHolder(type1ViewHolder,data,position);
                break;

            case 2:
                Type2ViewHolder type2ViewHolder=(Type2ViewHolder)holder;
                type2ViewHolder.ConfigHolder(type2ViewHolder,data,position);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    @Override
    public int getItemViewType(int position) {
        int viewtype=data[position].getType();
        return viewtype;

    }
}
