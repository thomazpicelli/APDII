package Atv01;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author thomazpicelli
 */
public class Cliente {
    
    private String nome;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();
    
    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }
    
    public String gerarExtrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        for (Aluguel aluguel: fitasAlugadas) {
            double valorCorrente = 0.0;
            // determina valores para cada linha
            // switch com enum
            switch (aluguel.getFita().getTipo()) {
            case Normal:
                valorCorrente += 2;
                if (aluguel.getDiasAlugada() > 2) {
                    valorCorrente += (aluguel.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case Lancamento:
                valorCorrente += aluguel.getDiasAlugada() * 3;
                break;
            case Infantil:
                valorCorrente += 1.5;
                if (aluguel.getDiasAlugada() > 3) {
                    valorCorrente += (aluguel.getDiasAlugada() - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (aluguel.getFita().getTipo() == Fita.Tipo.Lancamento
                && aluguel.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
            // mostra valores para este aluguel
            resultado += "\t" + aluguel.getFita().getTítulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        }//for
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
}

