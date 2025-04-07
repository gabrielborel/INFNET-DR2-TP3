package org.INFNET.TP3;

import java.util.Objects;

public class Task {
    private final String titulo;
    private final String descricao;
    private final Status status;
    private final User responsavel;

    public Task(String titulo, String descricao, Status status, User responsavel) {
        Objects.requireNonNull(titulo, "Título não pode ser nulo");
        Objects.requireNonNull(descricao, "Descrição não pode ser nula");
        Objects.requireNonNull(status, "Status não pode ser nulo");
        Objects.requireNonNull(responsavel, "Responsável não pode ser nulo");

        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.responsavel = responsavel;
    }

    public Task atribuirResponsavel(User novoResponsavel) {
        return new Task(this.titulo, this.descricao, this.status, novoResponsavel);
    }

    public Task alterarStatus(Status novoStatus) {
        return new Task(this.titulo, this.descricao, novoStatus, this.responsavel);
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
        System.out.println("Responsável: " + responsavel.getNome());
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public Status getStatus() { return status; }
    public User getResponsavel() { return responsavel; }

    public enum Status {
        TODO, IN_PROGRESS, DONE
    }
}
