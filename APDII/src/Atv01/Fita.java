package Atv01;

public class Fita {
    public enum Tipo {
        normal, lancamento, infantil
    };
    private String título;
    private Tipo códigoDePreço;
    public Fita(String título, Tipo códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }
    public String getTítulo() {
        return título;
    }
    public Tipo getCódigoDePreço() {
        return códigoDePreço;
    }
    public void setCódigoDePreço(Tipo códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }
}
