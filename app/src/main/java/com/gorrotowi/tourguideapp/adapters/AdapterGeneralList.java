package com.gorrotowi.tourguideapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gorrotowi.tourguideapp.R;
import com.gorrotowi.tourguideapp.entitys.ItemRestaurant;

import java.util.List;

/**
 * Created by Gorro on 07/01/17.
 */

public class AdapterGeneralList extends RecyclerView.Adapter<AdapterGeneralList.ViewHolder> {

    private Context context;
    private List<ItemRestaurant> data;

    public AdapterGeneralList(Context context, List<ItemRestaurant> data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurants, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        if (data.get(position).getImg() != 0) {
            holder.imgV.setImageResource(data.get(position).getImg());
        } else {
            holder.imgV.setVisibility(View.GONE);
        }
        holder.txtTitle.setText(data.get(position).getName());
        holder.txtDesc.setText(data.get(position).getDescription());
        holder.txtLocation.setText(data.get(position).getLocation());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlAddress = "http://maps.google.com/maps?q=" + data.get(position).getLat() + "," + data.get(position).getLng() + "(" + data.get(position).getName() + ")&iwloc=A&hl=es";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgV;
        TextView txtTitle;
        TextView txtDesc;
        TextView txtLocation;

        public ViewHolder(View itemView) {
            super(itemView);
            imgV = (ImageView) itemView.findViewById(R.id.imgItemRestaurant);
            txtTitle = (TextView) itemView.findViewById(R.id.txtItemTitleRestaurant);
            txtDesc = (TextView) itemView.findViewById(R.id.txtItemDescriRestaurant);
            txtLocation = (TextView) itemView.findViewById(R.id.txtItemLocationRestaurant);
        }
    }

}
