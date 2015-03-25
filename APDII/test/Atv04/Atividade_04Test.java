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
        Pessoa pessoa = new Pessoa("nome", "endereco");
        
        Tripulação tripulação = new Tripulação(2, pessoa);
        Passageiro passageiro = new Passageiro(6, pessoa);
        Agente agente = new Agente(1, pessoa);
        
        assertEquals("nome", pessoa.getNome());
        assertEquals("nome", agente.getPessoa().getNome());
        assertEquals("endereco", passageiro.getPessoa().getEndereco());
    }
}
