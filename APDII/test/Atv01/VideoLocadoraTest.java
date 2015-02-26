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
        
        Fita fita = new Fita("A Galinha Pintadinha", Fita.Tipo.Normal);
        fita.setTipo(Fita.Tipo.Normal);
        assertEquals("A Galinha Pintadinha", fita.getTítulo());
        assertEquals(Fita.Tipo.Normal, fita.getTipo());
        
        
        Aluguel aluguel = new Aluguel(fita, 3);
        assertEquals(fita, aluguel.getFita());
        assertEquals(3, aluguel.getDiasAlugada());
        
        cliente.adicionaAluguel(aluguel);
        cliente.gerarExtrato();
        System.out.println(cliente.gerarExtrato());
    }
}