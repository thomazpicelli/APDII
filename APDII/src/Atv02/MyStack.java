package Atv02;

import java.util.Vector;

/**
 *
 * @author thomazpicelli
 */
public class MyStack {
    Vector<Object> vetor = new Vector<Object>();
    public void push(Object element) {
        vetor.insertElementAt(element, 0);
    }

    public Object pop() {
        Object result = vetor.firstElement();
        vetor.removeElementAt(0);
        return result;
    }

    public String toString() {
        return vetor.toString();
    }
}