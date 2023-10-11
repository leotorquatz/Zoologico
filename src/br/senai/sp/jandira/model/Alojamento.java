package br.senai.sp.jandira.model;

public class Alojamento {
    private int numero;
    private boolean ocupado;
    private Animais animal;

    public Alojamento(int numero) {
        this.numero = numero;
        this.ocupado = false;
        this.animal = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Animais getAnimal() {
        return animal;
    }

    public void ocupar(Animais animal) {
        this.animal = animal;
        this.ocupado = true;
    }

    public void desocupar() {
        this.animal = null;
        this.ocupado = false;
    }
}
