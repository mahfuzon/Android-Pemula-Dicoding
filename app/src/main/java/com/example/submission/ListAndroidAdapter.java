package com.example.submission;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAndroidAdapter extends RecyclerView.Adapter<ListAndroidAdapter.ListViewHolder> {
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
    private ArrayList<Android> listAndroid;
    public ListAndroidAdapter(ArrayList<Android> list){
        this.listAndroid = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_android, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Android android = listAndroid.get(position);
        Glide.with(holder.itemView.getContext()).load(android.getImage()).apply(new RequestOptions().override(55,55)).into(holder.imgPhoto);
        holder.tvName.setText(android.getName());
        holder.tvDetail.setText(android.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listAndroid.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAndroid.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_picture);
            tvName = itemView.findViewById(R.id.tv_android_name);
            tvDetail = itemView.findViewById(R.id.tv_android_detail);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Android data);
    }
}
