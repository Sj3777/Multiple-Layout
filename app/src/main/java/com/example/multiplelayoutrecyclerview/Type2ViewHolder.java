package com.example.multiplelayoutrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Type2ViewHolder extends RecyclerView.ViewHolder {
    TextView message;
    CircleImageView image;
    public Type2ViewHolder(View itemView)
    {
        super(itemView);
        message=itemView.findViewById(R.id.msg);
        image=itemView.findViewById(R.id.image);

    }

    public void ConfigHolder(Type2ViewHolder type2ViewHolder,Model[] model,int position)
    {
        message.setText(model[position].getMsg());
        image.setImageResource(model[position].getImage());
    }


}

