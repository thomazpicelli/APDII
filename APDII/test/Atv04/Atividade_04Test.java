package Atv04;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Thomaz Picelli
 */
public class Atividade_04Test {
    @Test
    public void Test(){
        Pessoa pessoa = new Pessoa("Joao", "Rua da Consolação");
        
        Tripulação tripulação = new Tripulação(2, pessoa);
        Passageiro passageiro = new Passageiro(6, pessoa);
        Agente agente = new Agente(1, pessoa);
        
        assertEquals("Joao", pessoa.getNome());
        assertEquals("Joao", agente.getPessoa().getNome());
        assertEquals("Rua da Consolação", passageiro.getPessoa().getEndereco());
        assertEquals("Rua da Consolação", tripulação.getPessoa().getEndereco());
    }
}
