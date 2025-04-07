package org.INFNET.TP3;

public class Main {
    public static void main(String[] args) {
        User usuario = new User("Gabriel Borel", "gabriel.borel@al.infnet.edu.br", "ADMINISTRADOR");
        Task task = new Task("Criação do projeto", "Iniciar o repositório do projeto em questão", Task.Status.TODO, usuario);
        task.exibirDetalhes();
        Task taskAtualizada = task.alterarStatus(Task.Status.IN_PROGRESS);
        System.out.println("---");
        taskAtualizada.exibirDetalhes();
    }
}