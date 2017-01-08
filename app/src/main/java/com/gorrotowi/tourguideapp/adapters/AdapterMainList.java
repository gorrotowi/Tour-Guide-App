package com.gorrotowi.tourguideapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gorrotowi.tourguideapp.R;
import com.gorrotowi.tourguideapp.entitys.ItemMainList;
import com.gorrotowi.tourguideapp.listeners.RecyclerListener;

import java.util.List;

/**
 * @author Gorro
 */

public class AdapterMainList extends RecyclerView.Adapter<AdapterMainList.ViewHolder> {

    private List<ItemMainList> data;
    private RecyclerListener listener;

    public AdapterMainList(List<ItemMainList> data, RecyclerListener listener) {
        this.data = data;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.imageView.setImageResource(data.get(position).getImg());
        holder.textView.setText(data.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onRecyclerListener(holder.itemView, holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imgItemListMain);
            textView = (TextView) itemView.findViewById(R.id.txtItemListMain);
        }
    }

}
