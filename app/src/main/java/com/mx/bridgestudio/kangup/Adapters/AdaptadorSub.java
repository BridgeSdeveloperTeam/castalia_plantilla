package com.mx.bridgestudio.kangup.Adapters;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mx.bridgestudio.kangup.Models.ListCar;
import com.mx.bridgestudio.kangup.R;

import java.util.List;

/**
 * Created by Anthony on 11/11/2016.
 */

public class AdaptadorSub extends RecyclerView.Adapter<AdaptadorType.AnimeViewHolder>  {
    private List<ListCar> items;

    public AdaptadorSub(List<ListCar> items) {
        this.items = items;
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    @Override
    public AdaptadorType.AnimeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_sub, viewGroup, false);
        return new AdaptadorType.AnimeViewHolder(v);
    }

    public Resources getResources() {
        Resources resources = null;
        return resources;
    }

    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView descripcion;
        public AnimeViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.image_type);
            nombre = (TextView) v.findViewById(R.id.name);
            //    descripcion = (TextView) v.findViewById(R.id.description);
        }
    }
    @Override
    public void onBindViewHolder(AdaptadorType.AnimeViewHolder viewHolder, int i) {
        // viewHolder.imagen.setImageResource(items.get(i).getImage());

        viewHolder.imagen.setImageResource(R.drawable.zapato);
        viewHolder.nombre.setText(items.get(i).getName());
    }

}
