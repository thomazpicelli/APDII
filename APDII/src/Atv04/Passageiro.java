package Atv04;

/**
 *
 * @author Thomaz Picelli
 */
public class Passageiro{
    private int numeroSmiles; 
    private Pessoa pessoa;

    public Passageiro(int numeroSmiles, Pessoa pessoa) {
        this.numeroSmiles = numeroSmiles;
        this.pessoa = pessoa;
    }

    public int getNumeroSmiles() {
        return numeroSmiles;
    }

    public void setNumeroSmiles(int numeroSmiles) {
        this.numeroSmiles = numeroSmiles;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
