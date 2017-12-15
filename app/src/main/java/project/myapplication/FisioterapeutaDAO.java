package project.myapplication;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


public class FisioterapeutaDAO {

    private Banco db;

    public FisioterapeutaDAO(Banco db) {
        this.db = db;
    }

    public void insert (Fisioterapeuta fisioterapeuta){
        ContentValues values = new ContentValues();
        values.put(Banco.COL_NOME,fisioterapeuta.getNome());
        values.put(Banco.COL_CREFITO,fisioterapeuta.getCrefito());
        values.put(Banco.COL_HORARIO,fisioterapeuta.getHorario());
        values.put(Banco.COL_ESPECIALIDADE,fisioterapeuta.getEspecialidade());
        db.getWritableDatabase().insert("fisioterapeutas",null,values);
        db.getWritableDatabase().close();
    }

    public List<Fisioterapeuta> listar(){
        List<Fisioterapeuta> lista = new ArrayList<>();
        Cursor cursor = db.getReadableDatabase().query("fisioterapeutas", new String[]{"nome,crefito,horario,especialidade"},null,null,null,null,null );
        if(cursor.moveToNext()){
            cursor.moveToFirst();
            do {
                Fisioterapeuta f = new Fisioterapeuta(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
                lista.add(f);
            } while (cursor.moveToNext());
            db.getWritableDatabase().close();
        }
        return lista;
    }

}
