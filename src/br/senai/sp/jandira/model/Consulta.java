package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.Animais;

public class Consulta {
    public void consultarAnimal(Animais animal) {
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Saudável: " + (animal.isSaudavel() ? "Sim" : "Não"));
    }
}
