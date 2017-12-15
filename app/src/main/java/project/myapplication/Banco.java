package project.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Banco extends SQLiteOpenHelper {

    public static final String BANCO = "fisio.db";
    public static final int VERSAO = 1;
    private Context context;

    public static final String TABELA = "Fisioterapeutas";
    public static final String COL_ID = "_id";
    public static final String COL_NOME = "NOME";
    public static final String COL_CREFITO = "CREFITO";
    public static final String COL_HORARIO = "HORARIO";
    public static final String COL_ESPECIALIDADE = "ESPECIALIDADE";


    private static final String DATABASE_CREATE = "create table " + TABELA + "(" +
            COL_ID + " Integer primary key autoincrement ," +
            COL_NOME + " text not null," +
            COL_CREFITO + " text not null, "+
            COL_HORARIO + " text not null,"+
            COL_ESPECIALIDADE+" text not null"+");";

    public Banco(Context context) {
        super(context, BANCO, null, VERSAO);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table "+Banco.TABELA);
        onCreate(db);
    }

}
