package com.mx.bridgestudio.kangup.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.mx.bridgestudio.kangup.Adapters.AdaptadorType;
import com.mx.bridgestudio.kangup.Adapters.AdapterCarsxType;
import com.mx.bridgestudio.kangup.Controllers.BaseActivity;
import com.mx.bridgestudio.kangup.Models.ListCar;
import com.mx.bridgestudio.kangup.Models.SampleDivider;
import com.mx.bridgestudio.kangup.R;

import java.util.ArrayList;

/**
 * Created by USUARIO on 24/10/2016.
 */

public class CarsXtype extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener,NavigationView.OnNavigationItemSelectedListener {

    //  private ListView lista;
    // private ArrayList<ListCar> tipos = new ArrayList<ListCar>();
    // private ArrayAdapter<ListCar> AdapterArray;
    // private ListView list;
    // private AdaptadorList adaptador;
    private String opcionSeleccionada="";
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    // private List items = new ArrayList();
    ArrayList<ListCar> items= new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_types);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarr);
        toolbar.setTitle("Castalia");
        setSupportActionBar(toolbar);
        // Obtener el Recycler

        recycler = (RecyclerView) findViewById(R.id.recycler_view);
        recycler.setHasFixedSize(true);
        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
        final RecyclerView.ItemDecoration itemDecoration = new SampleDivider(this);
        recycler.addItemDecoration(itemDecoration);
        recycler.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recycler ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Toast.makeText(view.getContext(), "position = " +items.get(position).getName(), Toast.LENGTH_SHORT).show();
                     //   Intent intent = new Intent().setClass(
                     //           CarsXtype.this, CatalogCar.class);
                      //  startActivity(intent);
                      //  finish();
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
        // Crear un nuevo adaptador
        adapter = new AdapterCarsxType(items);
        recycler.setAdapter(adapter);
        fillList();
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
    public void fillList(){
        /*ListCar list = new ListCar();
        list.setName( "Articulos del Catalogo");
        list.setDescription("Breve descripcion del producto");
        list.setImage("R.drawable.zapato");*/

        /*for(int x=0;x<4;x++){
            items.add(x,list);
        }*/
        ListCar list [] = new ListCar[3];
        list[0] = new ListCar(1,"Castalia","nada");
        list[1] = new ListCar(2,"Trevo","nada");
        list[2] = new ListCar(3,"Ofertas","nada");

        for(int x=0; x<3;x++)
        {
            items.add(x,list[x]);
        }

    }
    public void onBackPressed()
    {
        Intent setIntent = new Intent(this,TypesOfAutomobiles.class);
        startActivity(setIntent);
        finish();
    }
}
