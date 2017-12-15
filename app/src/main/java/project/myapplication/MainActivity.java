package project.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> espec = listar();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,espec);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,ListFisios.class);
                intent.putExtra("espec", (Serializable)parent.getItemAtPosition(i));
                startActivity(intent);
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3244-3320"));
                startActivity(i);
            }
        });

    }

    private ArrayList<String> listar(){
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Urogenecologia");
        dados.add("Ortopedia");
        dados.add("Desportiva");
        dados.add("Pediatria");
        dados.add("Neurologia");
        return dados;
    }


}
