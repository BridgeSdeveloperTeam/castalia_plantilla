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
 * Created by Anthony on 02/11/2016.
 */
public class AdapterCarsxType extends RecyclerView.Adapter<AdapterCarsxType.AnimeViewHolder> {
    private List<ListCar> items;

    public AdapterCarsxType(List<ListCar> items) {
        this.items = items;
    }
    @Override
    public int getItemCount() {
        return items.size();
    }
    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_carsxtype, viewGroup, false);
        return new AnimeViewHolder(v);
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
            imagen = (ImageView) v.findViewById(R.id.image_catalog);
            nombre = (TextView) v.findViewById(R.id.name_catalog);
        }
    }
    @Override
    public void onBindViewHolder(AnimeViewHolder viewHolder, int i) {
        // viewHolder.imagen.setImageResource(items.get(i).getImage());

        viewHolder.imagen.setImageResource(R.color.colorAccent);
        viewHolder.nombre.setText(items.get(i).getName());
    }

}
