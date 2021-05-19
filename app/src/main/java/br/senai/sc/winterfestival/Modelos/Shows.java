package br.senai.sc.winterfestival.Modelos;

public class Shows {

    private String nome;
    private int data;
    private String local;

    public Shows(String nome, int data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return nome + " - " + data + " - " + local;
    }


}
