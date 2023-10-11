package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.Alojamento;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAlojamento {
    private List<Alojamento> alojamentos;

    public GerenciadorAlojamento(int quantidadeAlojamentos) {
        this.alojamentos = new ArrayList<>();
        for (int i = 1; i <= quantidadeAlojamentos; i++) {
            alojamentos.add(new Alojamento(i));
        }
    }

    public Alojamento getAlojamentoDisponivel() {
        for (Alojamento alojamento : alojamentos) {
            if (!alojamento.isOcupado()) {
                return alojamento;
            }
        }
        return null;
    }
}

