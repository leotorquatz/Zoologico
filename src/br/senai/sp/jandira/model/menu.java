package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public static void exibirMenu() {
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Consultar Animal");
        System.out.println("3. Registrar Informações de Saúde");
        System.out.println("4. Exibir Informações");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        GerenciadorAlojamento gerenciadorAnimais = new GerenciadorAlojamento();
        GerenciadorAlojamento gerenciadorAlojamento = new GerenciadorAlojamento(10);
        Consulta consulta = new Consulta();
        Saude saude = new Saude();
        ExibicaoInformacoes exibicaoInformacoes = new ExibicaoInformacoes();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    // Lógica para cadastrar animal
                    break;
                case 2:
                    // Lógica para consultar animal
                    break;
                case 3:
                    // Lógica para registrar informações de saúde
                    break;
                case 4:
                    // Lógica para exibir informações
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}

