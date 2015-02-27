package Atv01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomazpicelli
 */
public class VideoLocadoraTest {
    @Test
    public void testar(){ 
        Cliente cliente = new Cliente("Thomaz");
        assertEquals("Thomaz", cliente.getNome());
        
        Fita fita1 = new Fita("A Galinha Pintadinha", Fita.Tipo.Normal);
        Fita fita2 = new Fita("Matriz", Fita.Tipo.Lancamento);
        
        fita1.setTipo(Fita.Tipo.Normal);
        assertEquals("A Galinha Pintadinha", fita1.getTítulo());
        assertEquals(Fita.Tipo.Normal, fita1.getTipo());
        
        
        Aluguel aluguel1 = new Aluguel(fita1,3);
        Aluguel aluguel2 = new Aluguel(fita2, 5);
        
        assertEquals(3, aluguel1.getDiasAlugada());
        
        cliente.adicionaAluguel(aluguel1);
        cliente.adicionaAluguel(aluguel2);
        cliente.gerarExtrato();
    }
}