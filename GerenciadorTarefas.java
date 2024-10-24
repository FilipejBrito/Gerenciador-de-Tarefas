package org.GerenciaTarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    private static ArrayList<Tarefa> tarefas  = new ArrayList<>();

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opcao a seguir");

        while(true){
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluida ");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao){
                case 1:
                    addTarefa(teclado);
                    break;
                case 2:
                    listaTarefa();
                    break;
                case 3:
                    completaTarefa(teclado);
                    break;
                case 4:
                    removerTarefa(teclado);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    private static void addTarefa(Scanner teclado){
        System.out.println("Descricao da tarefa");
        String descricao = teclado.nextLine();
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada com sucesso");
    }

    private static void listaTarefa(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa encontrada");
        }else{
            for (int i = 0; i < tarefas.size(); i++){
                System.out.println((i+1) + ". " + tarefas.get(i));
            }
        }
    }

    private static void completaTarefa(Scanner teclado){
        listaTarefa();
        System.out.println("Numero da tarefa para marcar como concluida");
        int tarefasnumero = teclado.nextInt();
        if(tarefasnumero > 0 && tarefasnumero <= tarefas.size()){
            tarefas.get(tarefasnumero - 1).setCompletada(true);
            System.out.println("Tarefa marcada com seucesso");
        }else{
            System.out.println("Numero invalido");
        }
    }

    private static void removerTarefa(Scanner teclado){
        listaTarefa();
        System.out.println("numero da tarefa para remover");
        int numerotarefa = teclado.nextInt();
        if(numerotarefa > 0 && numerotarefa <= tarefas.size()){
            tarefas.remove(numerotarefa - 1);
            System.out.println("tarefa removida com sucesso");
        }else {
            System.out.println("numero invalido");
        }
    }
}
