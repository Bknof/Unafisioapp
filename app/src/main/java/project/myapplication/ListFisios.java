
package project.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ListFisios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fisios);

        FisioterapeutaDAO f = new FisioterapeutaDAO(new Banco(this));


        ListView listView = (ListView) findViewById(R.id.listView2);
        ArrayList<Fisioterapeuta> fisios = listarfisios();

        ArrayAdapter<Fisioterapeuta> arrayAdapter = new ArrayAdapter<Fisioterapeuta>(ListFisios.this, android.R.layout.simple_list_item_1, fisios);
        listView.setAdapter(arrayAdapter);

        // Detalhe Activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(ListFisios.this, Detalhes.class);
                intent.putExtra("fisios", (Serializable) parent.getItemAtPosition(i));
                startActivity(intent);
            }
        });

    }



    private ArrayList<Fisioterapeuta> listarfisios(){
        ArrayList<Fisioterapeuta> dados = new ArrayList<Fisioterapeuta>();
        dados.add(new Fisioterapeuta(1,"Rosana","001","Matutino","Urogenecologia"));
        dados.add(new Fisioterapeuta(2,"Pedro","002","Vespertino","Pediatria"));
        dados.add(new Fisioterapeuta(3,"Roberto","003","Vespertino","Desportiva"));
        dados.add(new Fisioterapeuta(4,"Maria","004","Matutino","Neurologia"));
        return dados;
    }

}

