package org.INFNET.TP3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sprint {
    private final String nome;
    private final LocalDate dataInicio;
    private final LocalDate dataFim;
    private final List<Task> tarefas;

    public Sprint(String nome, LocalDate dataInicio, LocalDate dataFim, Optional<List<Task>> tarefas) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tarefas = tarefas.orElse(new ArrayList<>());
    }

    public Sprint adicionarTarefa(Task tarefa) {
        List<Task> tasks = new ArrayList<>(tarefas);
        tasks.add(tarefa);
        return new Sprint(nome, dataInicio, dataFim, Optional.of(tasks));
    }

    public Sprint removerTarefa(Task tarefa) {
        List<Task> tasks = new ArrayList<>(tarefas);
        tasks.remove(tarefa);
        return new Sprint(nome, dataInicio, dataFim, Optional.of(tasks));
    }

    public void listarTarefas() {
        for (Task tarefa : tarefas) {
            System.out.println(tarefa.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public List<Task> getTarefas() {
        return new ArrayList<>(tarefas);
    }
}
