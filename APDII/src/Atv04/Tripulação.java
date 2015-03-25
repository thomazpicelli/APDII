package Atv04;

/**
 *
 * @author Thomaz Picelli
 */
public class Tripulação{
    private int id_tripulacao;
    private Pessoa pessoa;

    public Tripulação(int id_tripulacao, Pessoa pessoa) {
        this.id_tripulacao = id_tripulacao;
        this.pessoa = pessoa;
    }

    public int getId_tripulacao() {
        return id_tripulacao;
    }

    public void setId_tripulacao(int id_tripulacao) {
        this.id_tripulacao = id_tripulacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
