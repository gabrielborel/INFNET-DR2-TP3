package org.INFNET.TP3;

import java.time.LocalDate;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User usuario = new User("Gabriel Borel", "gabriel.borel@al.infnet.edu.br", "ADMINISTRADOR");
        Task task = new Task("Criação do projeto", "Iniciar o repositório do projeto em questão", Task.Status.TODO, usuario);
        System.out.println("Task antes de ser atualizada");
        task.exibirDetalhes();
        Task taskAtualizada = task.alterarStatus(Task.Status.IN_PROGRESS);
        System.out.println("---");
        System.out.println("Task depois de ser atualizada");
        taskAtualizada.exibirDetalhes();

        System.out.println("\n");

        Sprint sprint = new Sprint("Sprint 1", LocalDate.now(), LocalDate.now().plusDays(14), Optional.empty());
        System.out.println("Sprint antes de ser alteado");
        sprint.listarTarefas();
        Sprint sprintAtualizado = sprint.adicionarTarefa(taskAtualizada);
        System.out.println("---");
        System.out.println("Sprint depois de alterado");
        sprintAtualizado.listarTarefas();
    }
}