package com.enjamamulhoque.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {

    Context context;
    List<ModelUser> list;

    public UserAdapter(Context context, List<ModelUser> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler_view_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

        String name = list.get(position).getName();
        String profession = list.get(position).getProfession();

        holder.nameView.setText(name);
        holder.professionView.setText(profession);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
