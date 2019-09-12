package com.example.exercicio2;

public class Produto {
    private String nome;
    private String quantidade;
    private String prioridade;

    public Produto(String nome, String quantidade,String prioridade ) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
