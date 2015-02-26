package Atv01;

import java.util.ArrayList;

/**
 *
 * @author thomazpicelli
 */
public class Aluguel {
    private Fita fita;
    private int diasAlugada;
    private ArrayList<Aluguel> aluguel = new ArrayList<Aluguel>();

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
}
 

