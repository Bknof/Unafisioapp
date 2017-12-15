package project.myapplication;


import android.provider.BaseColumns;

public class FisioContract {

    public static final String DB_NOME = "fisio.db";
    public static final int DB_VERSAO = 0;
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE" +
            FisioEntry.TABELA_NOME + "("+
            FisioEntry._ID + "INTEGER PRIMARY KEY," +
            FisioEntry.COLUNA_NOME_NOME + "TEXT," +
            FisioEntry.COLUNA_NOME_CREFITO + "TEXT," +
            FisioEntry.COLUNA_NOME_HORARIO + "TEXT," +
            FisioEntry.COLUNA_NOME_ESPECIALIDADE + "TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS" + FisioEntry.TABELA_NOME;

    public static class FisioEntry implements BaseColumns{
        public static final String TABELA_NOME = "fisioterapeuta";
        public static final String COLUNA_NOME_NOME = "nome";
        public static final String COLUNA_NOME_CREFITO = "crefito";
        public static final String COLUNA_NOME_HORARIO = "horario";
        public static final String COLUNA_NOME_ESPECIALIDADE = "especialidade";
    }
}
