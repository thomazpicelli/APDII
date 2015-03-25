package Atv02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author thomazpicelli
 */
public class MyStackTest{
    MyStack pilha;
    @Test
    public void test(){
        pilha = new MyStack();
        pilha.push(5);
        pilha.push(4);
        pilha.push(3);
        assertEquals("[3, 4, 5]", pilha.toString());
        pilha.pop();
        assertEquals("[4, 5]", pilha.toString());
    }
}

