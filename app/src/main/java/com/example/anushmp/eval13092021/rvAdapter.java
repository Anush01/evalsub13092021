package com.example.anushmp.eval13092021;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.rvViewholder> {


    @NonNull
    @Override
    public rvViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull rvViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class rvViewholder extends RecyclerView.ViewHolder{

        public rvViewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
