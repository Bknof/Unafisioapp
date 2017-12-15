package project.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detalhes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        Fisioterapeuta f = (Fisioterapeuta) getIntent().getSerializableExtra("fisios");

        TextView nome =(TextView)
                findViewById(R.id.textView1);
        TextView crefito =(TextView)
                findViewById(R.id.textView2);
        TextView horario =(TextView)
                findViewById(R.id.textView3);
        TextView espec =(TextView)
                findViewById(R.id.textView4);


        nome.setText(f.getNome());
        crefito.setText(f.getCrefito());
        horario.setText(f.getHorario());
        espec.setText(f.getEspecialidade());



    }


}
