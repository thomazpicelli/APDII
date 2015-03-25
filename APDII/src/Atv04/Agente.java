package Atv04;

/**
 *
 * @author Thomaz Picelli
 */
public class Agente{
    private int id_agente;
    private Pessoa pessoa;

    public Agente(int id_agente, Pessoa pessoa) {
        this.id_agente = id_agente;
        this.pessoa = pessoa;
    }

    public int getId_agente() {
        return id_agente;
    }

    public void setId_agente(int id_agente) {
        this.id_agente = id_agente;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
       
}
