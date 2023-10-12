package com.enjamamulhoque.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView nameView, professionView;

    public UserViewHolder(View itemView) {
        super(itemView);

        nameView = itemView.findViewById(R.id.item_recycler_view_user_name_view);
        professionView = itemView.findViewById(R.id.item_recycler_view_user_profession_view);

    }
}
