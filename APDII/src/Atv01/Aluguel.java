package Atv01;

import java.util.ArrayList;

/**
 *
 * @author thomazpicelli
 */
public class Aluguel {
    private Fita fita;
    private int diasAlugada;
    private ArrayList<Fita> fitas = new ArrayList<Fita>();

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }
    public Fita getFita() {
        return fita;
    }
    public int getDiasAlugada() {
        return diasAlugada;
    }
    public void adicionaFita(Fita fita){
        fitas.add(fita);
    }    
     
    public double gerarExtrato(Aluguel aluguel){
        double valorCorrente = 0.0;
        int dias = aluguel.getDiasAlugada();
        switch (aluguel.getFita().getTipo()){
            case Normal:
                valorCorrente += 2;
                if (dias > 2) {
                    valorCorrente += (dias - 2) * 1.5;
                }
                break;
            case Lancamento:
                valorCorrente += dias * 3;
                break;
            case Infantil:
                valorCorrente += 1.5;
                if (dias > 3) {
                    valorCorrente += (dias - 3) * 1.5;
                }
                break;
        } // switch
        return valorCorrente;
    }
    
    public int pontosFrequente(Aluguel aluguel){
        int pontosDeAlugadorFrequente = 0;
        pontosDeAlugadorFrequente++;
        if (aluguel.getFita().getTipo() == Fita.Tipo.Lancamento && aluguel.getDiasAlugada() > 1){
            pontosDeAlugadorFrequente++;
        }
        return pontosDeAlugadorFrequente;
    }    
    /*
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
    */
}