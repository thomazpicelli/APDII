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
    
    public void gerarExtrato() {
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        for (Aluguel aluguel: fitasAlugadas) {
            double valorCorrente = 0.0;
            int dias = aluguel.getDiasAlugada();
            switch (aluguel.getFita().getTipo()) {
            case Normal:
                valorCorrente += 2;
                if (dias > 2) {
                    valorCorrente += (dias - 2) * 1.5;
                }
                break;
            case Lancamento:
                if(dias > 1)
                    pontosDeAlugadorFrequente++;
                valorCorrente += dias * 3;
                break;
            case Infantil:
                valorCorrente += 1.5;
                if (dias > 3) {
                    valorCorrente += (dias - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            String result = ResultadoExtrato(aluguel, valorCorrente, valorTotal, pontosDeAlugadorFrequente);
            System.out.println(result);
        }//for
    }
    
    public String ResultadoExtrato(Aluguel aluguel,double valorCorrente, double valorTotal, int pontosDeAlugadorFrequente){
        final String fimDeLinha = System.getProperty("line.separator");
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        resultado += "\t" + aluguel.getFita().getTítulo() + "\t" + valorCorrente + fimDeLinha;
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;    
    }
}

