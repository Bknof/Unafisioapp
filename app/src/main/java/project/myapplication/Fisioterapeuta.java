package project.myapplication;


import java.io.Serializable;

public class Fisioterapeuta implements Serializable {

    private Integer _id;
    private String nome;
    private String crefito;
    private String horario;
    private String especialidade;

    public Fisioterapeuta(Integer _id, String nome, String crefito, String horario, String especialidade) {
        this._id = _id;
        this.nome = nome;
        this.crefito = crefito;
        this.horario = horario;
        this.especialidade = especialidade;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrefito() {
        return crefito;
    }

    public void setCrefito(String crefito) {
        this.crefito = crefito;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return nome;
    }
}
