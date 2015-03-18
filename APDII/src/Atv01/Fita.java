package Atv01;

/**
 *
 * @author thomazpicelli
 */
public class Fita {
    public enum Tipo {
        Normal, Lancamento, Infantil
    };
    private String título;
    private Tipo tipo;
    
    public Fita(String título, Tipo tipo) {
        this.título = título;
        this.tipo = tipo;
    }
    public String getTítulo() {
        return this.título;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public int pontosFrequente(Aluguel aluguel){
        int pontosDeAlugadorFrequente = 0;
        pontosDeAlugadorFrequente++;
        if (aluguel.getFita().getTipo() == Fita.Tipo.Lancamento && aluguel.getDiasAlugada() > 1){
            pontosDeAlugadorFrequente++;
        }
        return pontosDeAlugadorFrequente;
    }
}
