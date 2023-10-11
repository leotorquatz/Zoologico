package br.senai.sp.jandira.model;

public class ExibicaoInformacoes {
    public void exibirInformacoes(Animais animal, Alojamento alojamento) {
        System.out.println("Informações do Animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Saudável: " + (animal.isSaudavel() ? "Sim" : "Não"));

        if (alojamento.isOcupado()) {
            System.out.println("\nInformações do Alojamento:");
            System.out.println("Número: " + alojamento.getNumero());
        } else {
            System.out.println("\nO animal não está alojado.");
        }
    }
}
