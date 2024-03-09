package ficha3;

import java.lang.StringBuilder;

public class Circulov2 {

    //Variáveis de instância
    private Ponto ponto;
    private double raio;

    /**
     * Construtor por omissão;
     */
    public Circulov2(){
        this.ponto = new Ponto();
        this.raio = 0;
    }

    /**
     * Construtor parâmetrizado
     */
    public Circulov2(Ponto p, double r){
        this.ponto = p.clone();
        this.raio = r;
    }

    /**
     * Construtor de cópia
     */
    public Circulov2(Circulov2 c2){
        this.ponto = c2.getPonto();
        this.raio = c2.getRaio();
    }

    /**
     * Método que verifica se dois Círculosv2 são iguais.
     * @param o objeto a comparar.
     * @return boolean que verifica se o objeto que recebeu a mensagem é igual ao que se está a comparar.
     */
    public boolean equals(Object o){
        if(this == o)
            return true;
        if((o == null) || (o.getClass() != this.getClass()))
            return false;

        Circulov2 c = (Circulov2) o;

        return (this.getPonto() == c.getPonto() && this.getRaio() == c.getRaio());
    }

    /**
     * Método que devolve o Círculov2 em formato de String.
     * @return String com as características deste Círculov2.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Coordenada do x: ").append(this.getPonto().getX()).append("\n")
                .append("Coordenada do y: ").append(this.getPonto().getY()).append("\n")
                .append("Raio: ").append(this.getRaio()).append("\n");

        return sb.toString();
    }

    /**
     * Método que representa faz clone de um Círculov2.
     * @return Círculov2 clone da que recebeu a mensagem.
     */
    public Circulov2 clone(){
        return new Circulov2(this);
    }

    public void alteraCentro(int x, int y){
        this.ponto.setX(x);
        this.ponto.setY(y);
    }

    public double calculaArea(){
        return Math.PI * Math.pow(this.getRaio(),2);
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    /**
     * Getters e Setters
     */

    public Ponto getPonto() {
        return this.ponto.clone();
    }

    public double getRaio() {
        return this.raio;
    }

    public void setPonto(Ponto p) {
        this.ponto = p.clone();
    }

    public void setRaio(double r) {
        this.raio = r;
    }
}
