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
    
    
}