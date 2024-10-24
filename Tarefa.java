package org.SistemaFinaceiroSpring;


public class Tarefa {
        private String descricao;
        private boolean completada;

    public Tarefa(String descricao ) {
        this.descricao = descricao;
        this.completada = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return (completada ? "[X] " : "[ ] ") + descricao;
    }
}
